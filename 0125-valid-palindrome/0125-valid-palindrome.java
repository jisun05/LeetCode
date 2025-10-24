class Solution {
    public boolean isPalindrome(String s) {

        
        
        // int first = s.charAt(0);
        // int last = s.charAt(s.length()-1);
          
        int first =0;
        int last =s.length()-1;
        while(first<last){
            while(first<last && !Character.isLetterOrDigit(s.charAt(first))){
                first++;
            }
            while(first<last && !Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }

            if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
                return false;
            }

            first++;
            last--;
        }



        return true;
    }
}