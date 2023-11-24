class Solution {
    public int[] topKFrequent(int[] nums, int k) { 
        int n = nums.length;
        int result[] = new int[k];
    
        // HashMap to store key and frequency (element, count)     
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int ele : nums)
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        
        // TreeMap to store frequency and list of keys with that frequency
        TreeMap<Integer, List<Integer>> invert_hm = new TreeMap<>(Collections.reverseOrder());
        
        // Traversal using entrySet() to put count and element
        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int count = e.getValue();
            int key = e.getKey();
            
            invert_hm.computeIfAbsent(count, unused -> new ArrayList<>()).add(key);
        }
        
        // Looping on first k elements in invert_hm to get k frequent elements
        int count = 0;
        for(Map.Entry<Integer, List<Integer>> entry : invert_hm.entrySet()) {
            List<Integer> keys = entry.getValue();
            
            for(int key : keys) {
                result[count++] = key;
                
                if(count == k) {
                    return result;
                }
            }
        }
        
        return result;
    }
}


// ----------------------------- First Approach ---------------------------------
/*
class Solution {
    public int[] topKFrequent(int[] nums, int k) { 
        int n = nums.length;
        int result[] = new int[k];
    
        // HashMap to store key and fequency (element, count)     
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int ele : nums)
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        
        // HashMap to store frequency and key (count, element)
        TreeMap<Integer,Integer> invert_hm = new TreeMap<>(Collections.reverseOrder());
        
        // 1. Traversal using entrySet() to put count and element
        for(HashMap.Entry<Integer,Integer> e : hm.entrySet())
            invert_hm.put(e.getValue(), e.getKey());
            
        
        // Looping on first k element in invert_hm in reverse order to get k frequent element
        int count =0;
        int idx = 0;
        for(HashMap.Entry<Integer,Integer> e : invert_hm.entrySet()){
            result[idx++] = e.getValue();
            count++;
            
            if(count == k){
                break;
            }
        }
        
        return result;
        
    }
}

 */