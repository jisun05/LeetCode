class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3) return new ArrayList<>();

        List<List<Integer>> answer = new ArrayList<>();     
        Arrays.sort(nums);
        for(int first =0; first<nums.length-2;first++){
            if (first> 0 && nums[first] == nums[first - 1]) continue;
            int second = first+1;
            int third = nums.length-1; 

            while(second<third){
                int sum = nums[first]+ nums[second] + nums[third];
                if(sum == 0){
                answer.add(Arrays.asList(nums[first],nums[second],nums[third]));
                while(second <third && nums[second] ==nums[second+1]) second++;
                while(second <third && nums[third] == nums[third-1]) third--;


                second++;
                third--;

                }else if(sum > 0){
                    third--;
                }else{
                    second++;
                }
            }

        }
        return answer;
    }
}