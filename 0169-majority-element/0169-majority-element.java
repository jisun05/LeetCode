class Solution {
    public int majorityElement(int[] nums) {

            //calculate nums.length/2
            //0
            //2,3
            //asap return? or calculate all and return?
            int majority =  nums.length/2;

            HashMap<Integer, Integer> count = new HashMap<>();
            for(int num : nums){
                int often = count.getOrDefault(num, 0) +1;
                if(often > majority ) return num;

                count.put(num, often);
            }
                return -1;
        
        
                  }

      
        
    }
