class Solution {
    public int maxArea(int[] height) {

        int first =0;
        int last = height.length-1;
        int theMost = 0;
        
        while(first < last){
           int width = last - first;  //idx
           int h = Math.min(height[first],height[last]);
           theMost = Math.max(theMost, width*h);

           if(height[first]>height[last]){
            last--;
           }else if(height[first]<height[last]){
            first++;
           }else{
            first++;
            last--;
           }


        }
        return theMost;
        
    }
}