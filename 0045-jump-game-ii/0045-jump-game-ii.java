class Solution {
    public int jump(int[] nums) {

        int step =0;
        int farthest =0;
        int currentEnd =0;

        for(int i=0 ; i < nums.length-1;i++){
            farthest = Math.max(nums[i] + i, farthest);
            if(i ==currentEnd){
                step++;
                currentEnd = farthest;
            }
        }
       
       return step;
        
    }
}