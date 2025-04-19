class Solution {
    public int maxArea(int[] height) {
        
        //height = 1,8,6,2,5,4,8,3,7
      
        int left = 0;
        int right = height.length-1;
        int max =0;
        while(left < right){
            int high = Math.min(height[left],height[right]); // 8
            int width = right - left;

            max = Math.max(max,high * width);
            if(height[left] < height[right]){
                left++;
            
            }
            else if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
                right--;

            }
        }
    return max;
    }
}