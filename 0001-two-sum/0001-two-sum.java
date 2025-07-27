class Solution {
    public int[] twoSum(int[] nums, int target) {


       
       for(int first =0; first<nums.length-1;first++){
            int second =first+1;
            while(second<nums.length){
                int sum =nums[first] + nums[second];

                if(sum== target){
                    return new int[]{first,second};
                }else{
                    second++;
                }
            }
       }
        return new int[]{-1};
    }
}