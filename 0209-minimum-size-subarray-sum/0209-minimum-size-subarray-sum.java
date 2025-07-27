class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       // [2,3,1,2,4,3]
        int minimal=Integer.MAX_VALUE;
        int left =0;
        int sum =0;
     //   Map<Integer, Integer> map = new HashMap<>();
        for(int right=0; right<nums.length;right++){
            sum += nums[right];  //2
            while(left<=right && sum>= target){
                minimal = Math.min(minimal, right-left+1);
                sum -= nums[left];
                left++;
            }
               

        }
             if(minimal == Integer.MAX_VALUE ) return 0;
        
            return minimal;
        
    }
}