class Solution {
    public int strStr(String haystack, String needle) {

        int check = needle.length();
        int whole = haystack.length();

        for(int start =0; start <= whole - check;start++){
            for(int i=0;i <check;i++){
                if(needle.charAt(i) != haystack.charAt(start+i)){
                    break;
                }

                if(i == check-1) return start;
            }
        }
        return -1;
    }
}