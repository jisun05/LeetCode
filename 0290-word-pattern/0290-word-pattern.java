class Solution {
    public boolean wordPattern(String pattern, String s) {
        // pattern = "abba", s = "dog cat cat dog"
        String[] sSplit = s.split(" ");
       if(pattern.length() != sSplit.length) return false;

        Map<Character, String> patternToString = new HashMap<>();
        Map<String, Character> stringToPattern = new HashMap<>();
        for(int i=0;i< sSplit.length;i++){
            if(patternToString.containsKey(pattern.charAt(i)) && !patternToString.get(pattern.charAt(i)).equals(sSplit[i])){
                 return false;
            }else{patternToString.put(pattern.charAt(i), sSplit[i]); }
                
            if(stringToPattern.containsKey(sSplit[i]) && !stringToPattern.get(sSplit[i]).equals(pattern.charAt(i)) ){
               return false;
            }  else{
                stringToPattern.put(sSplit[i], pattern.charAt(i));
            }
           
           
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<pattern.length();i++){
            sb.append(stringToPattern.get(sSplit[i]));
        }

           
            return true;

    }
}