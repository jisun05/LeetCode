class Solution {
    public int[] twoSum(int[] numbers, int target) {


        int first =0;
        int last = numbers.length-1;

        while(first<last){
            if(numbers[first]+numbers[last]< target){
                first++;
            }else if(numbers[first]+numbers[last]> target){
                last--;
            }else{
                return new int[] {first+1,last+1};
            }
        }


        return new int[]{-1};
    }
}