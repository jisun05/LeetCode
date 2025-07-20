class Solution {
    public int lengthOfLongestSubstring(String s) {


        int left =0;
        int right =0;
        int maxLength =0;
        HashSet<Character> check = new HashSet<>();
        // "abcabcbb"
        //  left
        //  right     
            while(right < s.length()){
                
             //if check have value already?
             while(check.contains(s.charAt(right))){
                check.remove(s.charAt(left));
                  left++;      
             }
            
                check.add(s.charAt(right));
                maxLength = Math.max(maxLength , right - left + 1 );
                right++;

            }


            return maxLength;

        
    }
}