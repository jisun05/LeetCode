class Solution {
    public int lengthOfLastWord(String s) {
        

        //뒤에서부터확인  "Hello World"
        int count =0;
        for(int i = s.length()-1; i >=0;i--){
            if(s.charAt(i) != ' '){
                count++;
            }else if(count !=0) break; 
           
        }

        return count;
    }
}