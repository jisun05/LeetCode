class Solution {
    public void rotate(int[] nums, int k) {


        k = k%nums.length;
        //nums = [1,2,3,4,5,6,7]
        //reverse all  //7,6,5,4,3,2,1
        for(int i=0; i< nums.length/2 ;i++){
            int save = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = save;
        }

        for(int i=0; i<k/2 ; i++){
            int save = nums[i]; 
            nums[i] = nums[k-1];     
            nums[k-1] = save;
        }

        for(int i=nums.length-1; i>=k; i--){
            int save = nums[i];
            nums[i] = nums[k];
            nums[k] = save;
            k++;
        }


    }
}