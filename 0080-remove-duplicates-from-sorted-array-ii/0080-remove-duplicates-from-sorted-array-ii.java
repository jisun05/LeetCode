class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int left =0;
        int longest = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int right =0; right < nums.length;right++){
            int check = nums[right];

            if(map.getOrDefault(check,0) < 2){
                map.put(check,map.getOrDefault(check,0)+1);
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}