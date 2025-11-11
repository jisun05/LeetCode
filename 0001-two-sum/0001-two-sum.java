class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();



        
        int index =0;
        for(int i : nums){
            
            int key = target - i;
            if(map.containsKey(key)){
                return new int[] {map.get(key),index};
            }else{
                map.put(i, index);
            }
            index++;
        }

        return new int[] {-1};



        
        
    }
}