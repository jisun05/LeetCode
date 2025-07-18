class Solution {
    public boolean isAnagram(String s, String t) {

        //s = "cat"
        //t = "ca"
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> checkChar = new HashMap<>();

        for(char splitS : s.toCharArray()){
            //"anagram"
            checkChar.put(splitS, checkChar.getOrDefault(splitS, 0)+1);
        }

        for(char splitT : t.toCharArray()){
           if(checkChar.containsKey(splitT) && checkChar.get(splitT) > 0){
               checkChar.put(splitT , checkChar.get(splitT)-1);
           }else{
            return false;
           }       
        }

        return true;
        
    }
}