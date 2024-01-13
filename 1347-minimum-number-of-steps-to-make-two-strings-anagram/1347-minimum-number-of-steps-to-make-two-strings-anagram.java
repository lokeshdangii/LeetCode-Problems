class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;  // variable to store answer i.e steps
        
        HashMap <Character,Integer> hm_s = new HashMap<>();
        HashMap <Character,Integer> hm_t = new HashMap<>();
        
        // storing frequencies of characters of S in hashmap
        for(char c : s.toCharArray()){
            hm_s.put(c, hm_s.getOrDefault(c,0)+1);
        }
        
        // storing frequencies of characters of T in hashmap
        for(char c : t.toCharArray()){
            hm_t.put(c, hm_t.getOrDefault(c,0)+1);
        }
        
        Set <Character> keys = hm_s.keySet();
        
        // Looping over all characters in both
        for (char key : keys) {
            // Check if the key is present in hm_t
            if (hm_t.containsKey(key)) {
                if (hm_t.get(key) < hm_s.get(key)) {
                    ans += hm_s.get(key) - hm_t.get(key);
                }
            } else {
                // If the key is not present in hm_t, all occurrences in s should be considered
                ans += hm_s.get(key);
            }
        }
        
       return ans; 
    }
}