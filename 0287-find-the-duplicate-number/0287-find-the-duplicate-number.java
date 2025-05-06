class Solution {
    public int findDuplicate(int[] nums) {
         //   8 1  1  9  8   7  4
         int slow = nums[0];
         int fast = nums[0];
        do{//I'm sure that at least one duplicates is there
        //nums.length == n + 1
        slow = nums[slow];
        fast = nums[nums[fast]];     
        
        }while(slow !=fast);


        //find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}