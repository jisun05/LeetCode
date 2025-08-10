class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          
            
            
            Map<String, List<String>> map = new HashMap<>();
            //해시맵에 숫자랑 같이 저장해서 비교

            for(String s : strs){

                char[] chars = new char[s.length()];

                chars = s.toCharArray();

                Arrays.sort(chars);
                String key = new String(chars);

                if(!map.containsKey(key)){
                    map.put(key, new ArrayList());
                }
                    map.get(key).add(s);
                

            }
            return new ArrayList<>(map.values());

        





        
    }
}