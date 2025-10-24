class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length() || s == null || t == null|| s.length() == 0 || t.length()==0) return false;

        Map<Character,Integer> map = new HashMap<>();

        for(char checkS : s.toCharArray()){
           map.put(checkS, map.getOrDefault(checkS, 0) +1 );
        }

        for(char checkT : t.toCharArray()){
            if(!map.containsKey(checkT) || map.get(checkT) == 0){
                return false;
            }else{
                  map.put(checkT, map.get(checkT) -1 );
            }


        }
        return true;
    }
}