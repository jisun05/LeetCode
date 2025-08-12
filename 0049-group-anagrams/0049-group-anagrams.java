class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String s: strs){
            char[] chars = new char[s.length()];
            for(int i=0;i<s.length();i++){
                chars[i] = s.charAt(i);

            }
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
                map.get(key).add(s);
            
        }
          result = new ArrayList<>(map.values());
        return result;
        
    }
}