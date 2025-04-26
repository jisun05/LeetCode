class Solution {
    public boolean isPalindrome(String s) {

        int first = 0;
        int last = s.length()-1 ; //  first solution=>  s.charAt.length()-1 

        while(first < last){
            if(!Character.isLetterOrDigit(s.charAt(first))){   //Character.isLetterOrDigit
                first++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }
            else if(Character.toLowerCase(s.charAt(first))  != Character.toLowerCase(s.charAt(last))){
                return false;
            }
            else{
                first++;
                last--;
            }
        }
    return true;



















        
    }
}