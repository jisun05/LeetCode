class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()== 0) return 0;

        Set<Character> set = new HashSet<>();
        int longest = 0;
        int left =0;

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            longest = Math.max(longest, i- left+1);
        }

        return longest;

        
    }
}