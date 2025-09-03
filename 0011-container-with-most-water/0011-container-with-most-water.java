class Solution {
    public int maxArea(int[] height) {

        //최대값 계산, 가로,세로
        int max = 0;
        int first = 0;
        int last = height.length-1;


        while(first<last){ 
            int square = (last -first) * Math.min(height[first], height[last]);
            max =  Math.max(max,square);

            if(height[first] < height[last]){
                first++;
            }else if(height[first]> height[last]){
                last--;
            }else{
                first++;
                last--;
            }




        }
        
       return max;
        
    }
}