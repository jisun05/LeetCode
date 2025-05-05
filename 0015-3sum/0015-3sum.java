class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
   //-4  -1  -1 0 1 2 
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int first = 0; first < nums.length - 2; first++) {
            if(first != 0 && nums[first] == nums[first-1]) continue;
            int second = first + 1;
            int last = nums.length - 1;
            while (second < last) {
                
                int sum = nums[first] + nums[second] + nums[last];
                if (sum == 0) {

                    result.add(Arrays.asList(nums[first], nums[second], nums[last]));
                        second++; last--;

                      while(second< last &&nums[second] == nums[second-1]){
                            second++;
                      }
                      while(second < last && nums[last] == nums[last+1] ){
                        last--;
                      }
                    
                } else if (sum < 0) {
                    second++;

                    }
                 else {
                    last--;
                }

              




            }

        }

        return result;

    }
}