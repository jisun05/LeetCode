

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
       
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        int[] result = new int[k];
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        for(int i=0;i<k;i++){
           result[i] = list.get(i).getKey();
        }

        return result;
    }
}