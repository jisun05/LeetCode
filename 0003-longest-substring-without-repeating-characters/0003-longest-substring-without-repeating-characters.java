class Solution {
    public int lengthOfLongestSubstring(String s) {


        if(s == null || s.length() ==0 ) return 0;

        Set<Character> set = new HashSet<>();
        int left =0;
        int right=0;
        int longest = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                right++;
                longest = Math.max(longest, right - left);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
       

        return longest;
        
    }
}