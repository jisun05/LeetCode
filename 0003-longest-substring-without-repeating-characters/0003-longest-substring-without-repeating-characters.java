class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int longest =0;
        int left =0;
        
        for(int right =0; right<s.length(); right++){
            char check = s.charAt(right);
            while(set.contains(check)){
                set.remove(s.charAt(left));
                left++;
            }
             set.add(check);
             longest = Math.max(longest, right - left +1 );
        }
        return longest;
    }
}