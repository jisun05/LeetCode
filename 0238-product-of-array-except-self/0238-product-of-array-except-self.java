class Solution {
    public int[] productExceptSelf(int[] nums) {


       
        int[] result = new int[nums.length];

       
        int left= 1;
        int right =1;
         result[0] = 1;
        for(int i = 1; i<nums.length;i++){
            left *= nums[i-1];
            result[i] = left;
           
        }


        for(int j = nums.length-2; j >= 0 ; j--){
            right *= nums[j+1];
            result[j] *= right;
        }

        return result;
        
    }
}