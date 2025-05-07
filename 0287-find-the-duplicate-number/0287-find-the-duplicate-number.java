class Solution {
    public int findDuplicate(int[] nums) {

            Arrays.sort(nums); // 1  2 2 3 4

        for(int first =0; first < nums.length -1 ; first++){

            int slow = nums[first];  
            int fast = nums[nums[first]];   

            if(slow ==fast){
                return slow;
            }
        }

            return -1;

        
    }
}