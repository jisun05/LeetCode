class MyHashMap {
    int[] map = new int[1000001];

    public MyHashMap() {
        Arrays.fill(map, -1);
    }
    
    public void put(int key, int value) {
              // do i have to make for change old value to new one?
                map[key] = value;
                

    }
    //I was wondering — if I initialize the entire map with -1 to indicate 'no value,' does that prevent me from storing -1 as a real value? How would I handle that case?
    public int get(int key) {
     

        return map[key];
    }
    
    public void remove(int key) {   
            map[key] = -1;      
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */