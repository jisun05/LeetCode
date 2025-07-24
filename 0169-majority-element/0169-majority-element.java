class Solution {
    public int majorityElement(int[] nums) {

            //make majority 
            int majority = nums.length/2;
            HashMap<Integer, Integer> count = new HashMap<>();

            //check each number 
            for(int num : nums){
  
                count.put(num, count.getOrDefault(num,0)+1);
                int often = count.get(num);
                if(often > majority) return num;
            }


            return -1;




        
    }
}