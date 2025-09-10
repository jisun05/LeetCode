class Solution {
    public int removeDuplicates(int[] nums) {

        int left =0;
      //1 1 2

        for(int right =1; right < nums.length;right++){
            if(nums[right-1] != nums[right]){
                left++;
                nums[left] = nums[right];
            }

        }
       
        // while(right < nums.length){
        //     if(nums[left] != nums[right]){
        //         nums[left] = nums[right];
        //         left++;
              
        //     }
        //     right++;
        // }
        return left+1;
    }
}