class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        Map<Character, String> patternToS = new HashMap<>();
        Map<String, Character> sToPattern = new HashMap<>();


        for(int i=0; i<pattern.length();i++){

            char c = pattern.charAt(i);
            String w = words[i];


            if(patternToS.containsKey(c)){//키 존재여부 확인
                if(!patternToS.get(c).equals(w)){//키 있는데 값이 다르면
                    return false; 
                }
            }
                else{
                    patternToS.put(c,w);
                }
            

            if(sToPattern.containsKey(w)){
                if(!sToPattern.get(w).equals(c)){
                    return false;
                }
            }else{
                sToPattern.put(w,c);           
                 }





        }



        return true;
    }
}