class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int [] result = new int[nums.length];

        int left =0;
        int right = nums.length; 
        int index = 0 ;



        while(left < right){
            int leftSquares = nums[left] * nums[left];
            int rightSquares = nums[right-1] * nums[right-1];

            if(leftSquares > rightSquares){
               result[nums.length - 1 - index ] =leftSquares;
               left++;
            }else{
                 result[nums.length - 1 - index ] =rightSquares;
                 right--;
            }
            index++;
        }

    return result;

    }
}