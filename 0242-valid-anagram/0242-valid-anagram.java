class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c2: t.toCharArray()){
            if(!map.containsKey(c2) || map.get(c2) == 0){
                return false;
            }else{
                map.put(c2, map.getOrDefault(c2,0)-1);
            }
        }

        return true;
    }
}