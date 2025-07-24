class Solution {
    public int jump(int[] nums) {


        //minimum number of jumps to reach last index
        //nums[i] -> maximum number of jumps
        // [2,3,1,1,4]
        int jumps = 0;
        int current =0;
        int toEnd =0;

        for(int i=0; i < nums.length-1;i++){
            
            //calculate how far can we go
            toEnd = Math.max(toEnd, i + nums[i]);  //2,4

            if(i == current){
                jumps++;  
                current = toEnd;    

            }
        }

return jumps;
      
    }
}