class Solution {
    public void rotate(int[] nums, int k) {

        k = k%nums.length;
        if(nums.length > 1 ){
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        } 
        //[1,2,3,4,5,6,7]
        //7654321
    }
    private int[] reverse(int[] nums, int first, int last){
            //765 4321
            while(first<last){
                int save =nums[first];
                nums[first] = nums[last];
                nums[last] =save;
                first++;
                last--;    
            }
            return nums;
    }

}