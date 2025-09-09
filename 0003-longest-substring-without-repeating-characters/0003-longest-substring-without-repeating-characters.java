class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longest =0;
        int left =0;
        int right =0;
        Set<Character> set = new HashSet<>();

        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }

            longest = Math.max(longest, right - left);
        }


        return longest;
    }
}