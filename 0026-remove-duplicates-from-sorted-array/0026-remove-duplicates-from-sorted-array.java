class Solution {
    public int removeDuplicates(int[] nums) {
        
          if (nums.length == 0) return 0;
        // 0 0 1 1 1 2 2 3 3 4

        int left =0;
       

        for(int right = 1 ; right < nums.length  ;right++){
                if(nums[left] != nums[right] ){
                    left++;
                    nums[left] = nums[right];
                }

        }
        return left + 1;
    }
}