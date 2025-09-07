class Solution {
    public int longestConsecutive(int[] nums) {

        //예외처리
        if(nums.length == 0 || nums == null) return 0;
        
        //중복숫자 중복카운트 방지를 위해 셋에 넣기
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        //연속된 길이 세기
        int count =0;

        for(int i : set){
            if(!set.contains(i-1)){
                int current = i;
                int length = 1;


                  while(set.contains(current+1)){
                current++;
                length++;
            }

            count = Math.max(length, count);
            }

          
        }

        return count;
    }
}