class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int first = 0; first < nums.length - 3; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) continue;

            for (int second = first + 1; second < nums.length - 2; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) continue;

                int third = second + 1;
                int last = nums.length - 1;

                while (third < last) {
                    long sum = (long) nums[first] + nums[second] + nums[third] + nums[last];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[first], nums[second], nums[third], nums[last]));
                        while (third < last && nums[third] == nums[third + 1]) third++;
                        while (third < last && nums[last] == nums[last - 1]) last--;
                        third++;
                        last--;
                    } else if (sum < target) {
                        third++;
                    } else {
                        last--;
                    }
                }
            }
        }
        return result;
    }
}
