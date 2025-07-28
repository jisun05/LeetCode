class Solution {
    public int jump(int[] nums) {

        int jumpCount =0;
        int farthest=0;
        int end=0;

        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max( i+ nums[i] ,farthest);
        if(i == end ){
            end= farthest;
            jumpCount++;
        }
            
        }
        return jumpCount;
    }
}