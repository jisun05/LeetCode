class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        int maxLength =1;
        for(int i: nums){
            set.add(i);
        }

        for(int check:set){
            int length=1;
            int currentStart=0;
            if(!set.contains(check-1)){
                 currentStart = check;
            }else{
                continue;
            }

            while(set.contains(currentStart+1)){          
                length++;
                currentStart++;
            }

            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}