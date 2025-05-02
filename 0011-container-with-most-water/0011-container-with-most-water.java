class Solution {
    public int maxArea(int[] height) {

        int first =0;
        int last = height.length-1;
        int result =0;
        // 가로길이: last - first
        // 세로길이: height[first] height[last] 중 낮은거

    while(first < last){
        int check = (last - first) * Math.min(height[first],height[last]);
        if(height[first] < height[last]){
                first++;
        }else if(height[first] > height[last]){
            last--;
        }else{
            first++;
            last--;
        }
        result = Math.max(result, check);

    }


    return result;


        
    }
}