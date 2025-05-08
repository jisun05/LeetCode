class Solution {
    public int[] twoSum(int[] numbers, int target) {


        if(numbers.length ==0) return new int[] {-1};

        //already sorted non-decreasing
        int first = 0;
        int last = numbers.length -1; 
        while(first < last){
            int sum = numbers[first] + numbers[last];

            if(sum == target){
                return new int[]{first+1, last +1};
            }
            else if(sum < target){
                first++;
            }else{
                last--;
            }

        }

        return new int[] {-1};
    }
}