class Solution {
    public boolean canJump(int[] nums) {

        int reach = 0;
        //int currentEnd =0;
        //[3,2,1,0,4]
        //[0,2,3]
        //4번(배열길이만큼) 이동하면 가능
        for(int i=0; i<=reach;i++){
             reach = Math.max(reach, i +nums[i]); //3
        
             if(reach >= nums.length-1){
                return true;
             }

        }
        return false;

    }
}