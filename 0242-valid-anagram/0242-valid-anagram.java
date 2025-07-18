class Solution {
    public boolean isAnagram(String s, String t) {


        HashMap<Character, Integer> checkChar = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(char count: s.toCharArray()){
     
            checkChar.put(count, checkChar.getOrDefault(count,0)+1);
        }

        for(char count:t.toCharArray()){
            if(checkChar.containsKey(count) && checkChar.get(count) !=0 ){
                checkChar.put(count,  checkChar.get(count) - 1);
            }else{
                return false;
            }

        }
        //s = "anagram", t = "nagaram"

        return true;

        
    }
}