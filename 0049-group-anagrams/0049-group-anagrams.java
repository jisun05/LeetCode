class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(int i =0; i< strs.length; i++){
            String key = strs[i];
        
            char[] check = key.toCharArray();
            Arrays.sort(check);
            key = new String(check);
            if(!map.containsKey(key)){
                 map.put(key, new ArrayList<>());
            }
                map.get(key).add(strs[i]);

        }
            
    List<List<String>> result = new ArrayList<>(map.values());






        return result;
        
    }
}