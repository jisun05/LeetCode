class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s == null || t  == null || s.length() != t.length()){
            return false;
        }
        //hashmap 
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<t.length();i++){
            char key = t.charAt(i);
            if(!map.containsKey(key)){
                return false;
            }else if(map.get(key) == 0){
                return false;
            }
            map.put(key, map.getOrDefault(key,0)-1 );
        }


        return true;


    }
}