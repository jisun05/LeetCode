class Solution {
    public void reverseString(char[] s) {                
        char save =' ';

        for(int i =0; i < s.length / 2; i++){
            save = s[i]; // save = h
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = save;
        }



      







        
    }
}