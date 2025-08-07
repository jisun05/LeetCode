class Solution {
    public boolean isPalindrome(String s) {

        int first =0;
        int last = s.length()-1;

        //"A woman, a plan, a canal: Panamowa"

        while(first < last){
            
            char currFirst = s.charAt(first);  //' '
            char currLast = s.charAt(last);    //'w'
            
            if(!Character.isLetterOrDigit(currFirst)){
                first++;
            

            }
            else if(!Character.isLetterOrDigit(currLast)){
                last--;
            }
                                        //a        a
           

                 else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		first++;
        		last--;
        	}

            
              
        }return true;
}}