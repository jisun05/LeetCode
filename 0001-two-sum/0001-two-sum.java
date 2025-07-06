class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> savePair = new HashMap<>();


        for(int i =0; i< nums.length;i++){
            int result = target - nums[i];


            if(savePair.containsKey(result)){


                return new int[]{savePair.get(result), i };

            }

            savePair.put(nums[i], i);




        }



            return new int[]{-1};

        
    }
}