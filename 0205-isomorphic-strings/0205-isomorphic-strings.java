class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;


        Map<Character, Character> sKeyMap = new HashMap<>();
        Map<Character, Character> tKeyMap = new HashMap<>();

        //s is key 
        for(int i=0 ; i< s.length();i++){
            //키가 없을떄만 넣기?
            if(!sKeyMap.containsKey(s.charAt(i))){
                sKeyMap.put(s.charAt(i), t.charAt(i));
            }   

            if(!tKeyMap.containsKey(t.charAt(i))){
                tKeyMap.put(t.charAt(i),s.charAt(i));
            }
        }

        for(int i=0; i< t.length();i++){
            if(!sKeyMap.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
            if(!tKeyMap.get(t.charAt(i)).equals(s.charAt(i))){
                return false;
            }

        }


        return true;
        
    }
}