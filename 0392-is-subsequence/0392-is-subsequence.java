class Solution {
    public boolean isSubsequence(String s, String t) {


        int small =0;
        int big =0;

        while(small < s.length() && big<t.length()){
            if(s.charAt(small) == t.charAt(big)){
                small++;
            }
            big++;
        }

        return small == s.length();


        
    }
}