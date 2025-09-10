class Solution {
    public int lengthOfLongestSubstring(String s) {


        if(s ==null || s.length() ==0) return 0;
        int left =0;
        int right =0;
        int longest =0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            char c = s.charAt(right);

            if(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(c);
                longest = Math.max(longest, right -left +1);
                 right++;
            
            }
           
        }
        
        return longest;
    }
}