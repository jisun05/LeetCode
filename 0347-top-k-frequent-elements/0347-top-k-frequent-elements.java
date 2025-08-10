class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer, Integer>> result = new ArrayList<>(map.entrySet());
        
        result.sort((e1,e2) -> e2.getValue().compareTo(e1.getValue()));

         int[] answer = new int[k];
        for(int i =0; i< answer.length;i++){
            answer[i] = result.get(i).getKey();
        }

        return answer;
        
    }
}