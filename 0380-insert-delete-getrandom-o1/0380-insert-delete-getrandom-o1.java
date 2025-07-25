class RandomizedSet {

    private HashMap<Integer,Integer> map;
    private ArrayList<Integer> array;
    private Random random;
    
    public RandomizedSet() {
        map = new HashMap<>();
        array = new ArrayList();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, array.size());
        array.add(val);     
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;   

        int idxToRemove = map.get(val);
        int lastElement = array.get(array.size() - 1);

        // swap
        array.set(idxToRemove, lastElement);
        map.put(lastElement, idxToRemove);

        //remove
        map.remove(val);
        array.remove(array.size()-1);
        return true;
        
    }
    
    public int getRandom() {
            int number= random.nextInt(array.size()); 
            return array.get(number);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */