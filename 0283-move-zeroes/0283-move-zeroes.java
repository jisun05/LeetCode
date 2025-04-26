class Solution {
    public void moveZeroes(int[] nums) {

     int save =0;
     for(int num : nums){
        if(num != 0){
            nums[save++] = num;
        }

     }
     while(save < nums.length){
        nums[save++] = 0;
     }


    }
}