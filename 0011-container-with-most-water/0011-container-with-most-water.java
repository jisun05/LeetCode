class Solution {
    public int maxArea(int[] height) {

        int first =0;
        int last = height.length-1;
        int max = 0;
        while(first<last){
            int h = Math.min(height[first],height[last]);
            int w = last-first;
            max = Math.max(max, h*w);
            if(height[first] < height[last]){
                first++;
            }else if(height[first] > height[last]){
                last--;
            }else{
                first++;
                last--;
            }

        }


        return max;
    }
}