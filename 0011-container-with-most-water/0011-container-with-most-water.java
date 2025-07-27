class Solution {
    public int maxArea(int[] height) {
            int square = 0;
            int first =0;
            int second = height.length-1;
           
            while(first < second){
                int current =0;
                if(height[first]> height[second]){
                    current = height[second] * (second-first);
                    second--;

                }else if(height[first]< height[second]){
                    current = height[first] * (second-first);
                    first++;
                }else{
                    current = height[first] * (second-first);
                    first++;
                    second--;
                }

                square = Math.max(square, current);
               
            }

        
        return square;
    }
}