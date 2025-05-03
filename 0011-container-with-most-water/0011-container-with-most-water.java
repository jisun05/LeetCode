class Solution {
    public int maxArea(int[] height) {


        int first =0;
        int last = height.length-1;
        int square =0;

        while(first <last){
            int result = (last - first) * Math.min(height[first], height[last]);
            if(height[first] > height[last]){
                last--;
            }else if(height[first] <height[last]){
                first++;
            }else{
                first++;
                last--;
            }
            
            square = Math.max(square, result);

        }

        return square;

        
    }
}