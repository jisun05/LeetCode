class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int first = 0; first < nums.length - 2; first++) {
            if (first > 0 && nums[first] == nums[first - 1])
                continue;

            int second = first + 1;
            int last = nums.length - 1;
            while (second < last) {
                if (nums[first] + nums[second] + nums[last] == 0) {
                    result.add(List.of(nums[first], nums[second], nums[last]));
                    second++;
                    last--;
                    while (second < last && nums[second] == nums[second - 1])
                        second++;
                    while (second < last && nums[last] == nums[last + 1])
                        last--;
                } else if (nums[first] + nums[second] + nums[last] < 0) {
                    second++;
                } else {
                    last--;
                }

            }
        }

        return result;

    }
}