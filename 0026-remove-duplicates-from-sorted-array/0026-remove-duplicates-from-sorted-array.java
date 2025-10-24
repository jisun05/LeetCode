class Solution {
    public int removeDuplicates(int[] nums) {

        int checkDuplicate =1;

        for(int i=1;i<nums.length;i++){
            int temp =0;
            if(nums[i] != nums[i-1]){
                temp = nums[i];
                nums[checkDuplicate] = temp;
                checkDuplicate++;
            }
        }

        return checkDuplicate;
    }
}