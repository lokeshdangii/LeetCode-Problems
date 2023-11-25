class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int ele : arr){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(Integer key : hm.keySet()){
            Integer value = hm.get(key);
            
            if(set.contains(value)){
                return false;
            }else{
                set.add(value);
            }
            
        }
        
        return true;
        
    }
}