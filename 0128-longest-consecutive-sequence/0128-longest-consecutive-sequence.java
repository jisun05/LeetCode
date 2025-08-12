import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;

        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int maxLength = 0;

        for (int num : set) {
            // 시작점: 이전 값이 없을 때 (MIN_VALUE는 무조건 시작점)
            if (num == Integer.MIN_VALUE || !set.contains(num - 1)) {
                int cur = num;
                int len = 1;

                // MAX_VALUE 가드로 wrap-around 방지
                while (cur != Integer.MAX_VALUE && set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;
    }
}
