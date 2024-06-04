class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        
        HashMap<Character,Integer> hm = new HashMap<>();    
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        
        int ans = 0;
        int odd = 0;
        boolean flag = false;  // flag to track the odd frequency of char

        // 2. Traversal using set(keys) and for each loop
        HashSet<Character> hs = new HashSet<>(hm.keySet());
        
        for(char key : hs ){
            if(hm.get(key)%2 == 0){
                ans += hm.get(key);
            }else{
                ans += hm.get(key)-1;
                flag = true;
            }
        }


        return flag == true ? ans+1 : ans;
    }
}