class Solution {
    public int[] productExceptSelf(int[] nums) {
        
   //1,2,3,4,point,6,8,9
        //앞 뒤 나눠서?
        
        int[] answer = new int[nums.length];
        int left =1;
        for(int i=0; i< nums.length; i++){
                answer[i] = left;
                left *= nums[i];
        }

        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            answer[i] *=right;
            right *= nums[i]; 
        }


        return answer;
    }
}