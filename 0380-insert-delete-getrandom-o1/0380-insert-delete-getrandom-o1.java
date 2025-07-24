class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {

        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
       
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    // 2, 3, 4, 5, 6 ,7 
    public boolean remove(int val) {
      if(!map.containsKey(val)) return false;
      int index = map.get(val);  // 
      int lastIndex = list.get(list.size()-1);    
      
      list.set(index, lastIndex);
      map.put(lastIndex,index);

      list.remove(list.size()-1);
      map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */