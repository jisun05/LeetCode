class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        Arrays.sort(nums);
        //하나를 고정시키고 움직여서?
        //값하나 빼고 나머지들을 다른 배열에 복사해서 투포인트로 체크?          
        List<List<Integer>> result = new ArrayList<>();
   
        for (int i = 0; i < nums.length - 2; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;
            int first = i+1;
            int last = nums.length -1 ;

            while(first < last){
                int target = nums[i] + nums[first] + nums[last];
                if(target ==0){
                    result.add(Arrays.asList(nums[i], nums[first],nums[last]));
                    first++;
                    last--;
                    while(first < last && nums[first] == nums [first-1]) first++;
                    while(first < last && nums[last] == nums[last+1]) last--;

                }else if(target < 0){
                    first++;
                }else{
                    last--;
                }




            }

        

           
            }

        

        return result;

}  
}