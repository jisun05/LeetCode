class Solution {
    public int[] twoSum(int[] nums, int target) {


        //Map
        Map<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int i: nums){
            int check = target - i;
            if(map.containsKey(check)){
                return new int[]{map.get(check),count};
            }

            map.put(i,count);
            count++;
        }
        return new int[]{-1};
        
    }
}