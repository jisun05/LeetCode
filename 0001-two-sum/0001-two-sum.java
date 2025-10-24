class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer,Integer> map = new HashMap<>();
        int first =0;
        int last = nums.length;

        while(first<last){
            int number = target - nums[first];
            if(map.containsKey(number)){
                return new int[]{map.get(number),first};
               
            }else{
                map.put(nums[first], first);
            }
             first++;
        }

      
        return new int[]{-1};
    }
}