class Solution {
    public boolean isPalindrome(String s) {


        //
        int first = 0;
        int end = s.length()-1;
        while(first<end){
            while(first<end && !Character.isLetterOrDigit(s.charAt(first))){
                first++;
            }
            while(first<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            

            if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            first++;
            end--;

        }
        return true;
        
    }
}