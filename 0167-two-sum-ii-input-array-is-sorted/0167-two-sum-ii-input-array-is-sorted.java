class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int first =0;
        int second = numbers.length-1;
        
        if(second ==0){
            return new int[] {-1};
        }
        
            for(int i=0; i <  numbers.length;i++){
            int sum = numbers[first]+numbers[second];

             if(sum == target){
                return new int[] {first+1,second+1};
             }
             else if(sum < target){
                first++;
             }else if(sum> target){
                second--;
             }
            

            

            }
             return new int[] {-1};
    }   
}

