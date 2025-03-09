class RandomizedSet {
    List<Integer> List;
    HashMap<Integer ,Integer> Map;
    Random randam = new Random();
    public RandomizedSet() {
        List =new ArrayList<Integer>();
        Map = new HashMap<Integer,Integer>();       
    }    
    public boolean insert(int val) {
        if( Map.containsKey(val))
        {
            return false;
        }
       Map.put(val,List.size());
       List.add(val);
       return true;       
    } 
    public boolean remove(int val) {
        if(!Map.containsKey(val))
        {
            return false;
        }
       int bhargavPositioncheck = Map.get(val); // position check in side map
       if(bhargavPositioncheck != (List.size()-1))
       {
       int lastElement = List.get(List.size()-1);
       List.set(bhargavPositioncheck, lastElement);// swap positons
       Map.put( lastElement,  bhargavPositioncheck );
       }
       Map.remove(val);
       List.remove(List.size()-1);
       return true;      
    }
    public int getRandom() {
       int bhargavRandamInt= randam.nextInt(List.size());
       return List.get(bhargavRandamInt);       
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */