class RandomizedSet {
    
    private Map<Integer, Integer>map;
    private List<Integer> randomArray;
    private Random rand;


    public RandomizedSet() {
        map = new HashMap<>();
        randomArray = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            map.put(val,randomArray.size());
            randomArray.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
         if (!map.containsKey(val)) {
            return false;
        }

        int indexToRemove = map.get(val);
        int lastVal = randomArray.get(randomArray.size() - 1);

        // 마지막 값을 삭제할 인덱스로 이동
        randomArray.set(indexToRemove, lastVal);
        map.put(lastVal, indexToRemove);

        // 리스트 마지막 요소 제거, map에서 val 제거
        randomArray.remove(randomArray.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int randonResult = rand.nextInt(randomArray.size());
        return randomArray.get(randonResult);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */