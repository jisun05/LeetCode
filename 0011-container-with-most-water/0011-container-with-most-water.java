class Solution {
    public int maxArea(int[] height) {

        int left =0;
        int right = height.length -1 ;
        int square =0;


            while(left < right){
                int result = (right- left) * Math.min(height[left], height[right]);
                square = Math.max(square, result);
                if(height[left] < height[right]){
                    left++;
                }else if(height[left] > height[right]){
                    right--;
                }else{
                    left++;
                    right--;
                }


            }




        return square;

       
        
    }
}