class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true; 

        int left = 0;  // s 
        int right = 0; // t 

        while (right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                if (left == s.length()) { // s를 끝까지 다 찾으면 성공
                    return true;
                }
            }
            right++;
        }

        return false; 
    }
}
