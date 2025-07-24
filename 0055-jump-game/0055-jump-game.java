class Solution {
    public boolean canJump(int[] nums) {

     //[2,3,1,1,4]
      int maxResearch = 0; //the maximun index that i can go from position

      for(int i=0; i< nums.length;i++){

        if(i > maxResearch) return false;

        maxResearch = Math.max( maxResearch, nums[i] +i);
      }


            return true;
        
    }
}