class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //first for문에서 돌리기 + first 앞뒤 값이 같을 경우
        //while 문 돌리기 (second, last)
        //같을 경우, 클경우, 작을 경우
        //second 하나만 움직였는데 다음 second랑 같은경우, last 하나만 움직였는데 이전 last랑 같은경우
         List<List<Integer>> result = new ArrayList<>();



          //  -4 ,  -1  -1  0  1  2   
          // -2 0 1 1 2
        Arrays.sort(nums);
        for (int first = 0; first < nums.length - 2; first++) {
            if (first != 0 && nums[first] == nums[first - 1])
                continue;

            int second = first + 1;
            int last = nums.length - 1;
           
            while (second < last) {
                int sum = nums[first] + nums[second] + nums[last];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[first], nums[second], nums[last]));
                        second++;
                        last--;
                    while (second < last && nums[second] == nums[second - 1]) {
                        second++;
                    }
                    while (second < last && nums[last] == nums[last + 1]) {
                        last--;
                    }

                } else if (sum < 0) {
                    second++;

                } else {
                    last--;
                }

            }
           
        }
         return result;

    }
}