// ------------------------ 2nd Approach ----------------------------------------------------

class Solution {
    public int[] topKFrequent(int[] nums, int k) { 
        int n = nums.length;
        int result[] = new int[k];
    
        // HashMap to store key and frequency (element, count)     
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int ele : nums)
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        
        // Create an ArrayList of values from the HashMap
        ArrayList<Integer> frequencies = new ArrayList<>(hm.values());
        
        // Sort the ArrayList in reverse order
        Collections.sort(frequencies, Collections.reverseOrder());
        
        // Loop from 0 to k and find the corresponding key from HashMap
        for (int i = 0; i < k; i++) {
            int frequency = frequencies.get(i);
            
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                if (e.getValue() == frequency) {
                    result[i] = e.getKey();
                    hm.remove(e.getKey());
                    break;
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