class Solution {
    public int longestConsecutive(int[] nums) {

        //예외처리
        if(nums.length == 0 || nums == null) return 0;
        //중복제거
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        //count
        int count =0;

        for(int n : set){
            if(!set.contains(n-1)){
                int current = n;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }

                count = Math.max(count,length);
            }
        }
        return count;
    }
}