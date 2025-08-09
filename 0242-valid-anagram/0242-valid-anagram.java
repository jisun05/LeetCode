class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0; i< s.length();i++){
            if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0){
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i)) -1);
        }

        return true;
    }
}