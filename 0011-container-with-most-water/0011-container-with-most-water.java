class Solution {
    public int maxArea(int[] height) {

        int square = 0;
        int first = 0;
        int last = height.length - 1;

        while (first < last) {
            int result = (last - first) * (Math.min(height[first], height[last]));

            square = Math.max(result, square);

            if (height[first] < height[last]) {
                first++;
            } else if (height[first] > height[last]) {
                last--;
            } else {
                first++;
                last--;
            }

        }

        return square;

    }
}