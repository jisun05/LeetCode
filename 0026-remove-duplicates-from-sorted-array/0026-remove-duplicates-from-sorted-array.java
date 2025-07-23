class Solution {
    public int removeDuplicates(int[] nums) {
        //  @ #   
      //1,1,2                   
        if(nums.length == 0) return 0;

        int left =1;
        for(int right =1; right < nums.length ; right++){
            //Check if the current value equals the previous one
            if(nums[right] != nums[left -1]){                 
             nums[left] = nums[right];
              left++;
        }

          

        
    }
      return left;
    }
}