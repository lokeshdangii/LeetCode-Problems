class RandomizedSet {
    
    private HashSet<Integer> hs;
    private Random random;

    public RandomizedSet() {
        hs = new HashSet<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        return hs.add(val);
    }
    
    public boolean remove(int val) {
        return hs.remove(val);
    }
    
    public int getRandom() {
        // Convert HashSet to ArrayList
        ArrayList<Integer> list = new ArrayList<>(hs);
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
*/