class Solution {
    public int maxArea(int[] height) {
        


            int left =0;
            int right =height.length -1 ;
            int square =0;

            while(left < right){
                int width = right - left;  
                int result = width * (Math.min(height[left], height[right]));
                square = Math.max(square, result);
                if(height[left] < height[right]){
                    left++;
                }else if(height[left] > height[right]){
                    right--;
                }else {
                    right--;
                    left++;
                }
            }

            return square;

    }
}