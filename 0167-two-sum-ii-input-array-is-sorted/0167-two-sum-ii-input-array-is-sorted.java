class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int first =0;
        int last = numbers.length -1;

        while(first < last){
            int result = numbers[first] + numbers[last];
            if(result == target){
                return new int[]{first+1, last+1};
            }
            else if(result > target){
                last--;
            }else{
                first++;
            }
        }
        return new int[]{-1};





        
    }
}