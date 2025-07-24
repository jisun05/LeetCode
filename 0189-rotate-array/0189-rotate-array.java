class Solution {
    public void rotate(int[] nums, int k) {

        //if k is bigger than nums.length?
         k = k%nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);

        
    }


    private int[] reverse(int[] nums, int first, int last){

        while(first< last){
            int save = nums[first];
            nums[first] = nums[last];
            nums[last] = save;

            first++;
            last--;
        }

        return nums;
    }





}