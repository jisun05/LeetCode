class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int end = s.length() - 1;

        while (first < end) {
            if (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else if (Character.toLowerCase(s.charAt(first)) == Character.toLowerCase(s.charAt(end))) {
                first++;
                end--;
            } else {
                return false;
            }

        }
        return true;

    }
}