class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> hm = new HashMap <>();

        // storing characters of s in map
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
       } 

        // checking character of t present in map or not
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);

            if(hm.get(ch) != null){
                if(hm.get(ch) ==1){
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return hm.isEmpty();
    }
}