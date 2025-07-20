class Solution {
    public int lengthOfLongestSubstring(String s) {
        

       int left =0;
       int right =0;
       int maxLength = 0;
       HashSet<Character> check = new HashSet<>();

        while(right < s.length()){
            char current = s.charAt(right);     
            while(check.contains(current)){
                check.remove(s.charAt(left));
                left++;
            }
            check.add(current);               
            maxLength = Math.max(maxLength, right - left + 1);    
             right++;
        }


        return maxLength;


    }
}