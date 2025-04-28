class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];  // 초기값은 임의의 세 수의 합

        for (int first = 0; first < nums.length - 2; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) 
                continue;

            int second = first + 1;
            int last = nums.length - 1;

            while (second < last) {
                int sum = nums[first] + nums[second] + nums[last];

                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum; 
                }

                if (sum == target) {
                    return sum; 
                } else if (sum > target) {
                    last--;
                } else {
                    second++;
                }
            }
        }
        return result;
    }
}
