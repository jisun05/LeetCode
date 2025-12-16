class Solution {
    public int longestConsecutive(int[] nums) {

        //해쉬셋으로 중복 제거?

        Set<Integer> set = new HashSet<>();


        for(int n: nums){
            set.add(n);
        }

        //longestConsecutive
        int count =0;

        for(int n : set){
            if(!set.contains(n-1)){
                int current =n;
                int length =1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                count = Math.max(count, length);
            }
        }


        return count;

        
    }
}