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
            }
                
            if(stringToPattern.containsKey(sSplit[i]) && !stringToPattern.get(sSplit[i]).equals(pattern.charAt(i)) ){
               
            }  
           patternToString.put(pattern.charAt(i), sSplit[i]); 
           stringToPattern.put(sSplit[i], pattern.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<pattern.length();i++){
            sb.append(stringToPattern.get(sSplit[i]));
        }

            if(!sb.toString().equals(pattern)){
                return false;
            }

            return true;

    }
}