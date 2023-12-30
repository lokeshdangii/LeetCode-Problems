class Solution {
    public int countCharacters(String[] words, String chars) {
        int n = words.length;
        int m = chars.length();
        
        int sum = 0;
        
        HashMap<Character, Integer> charmap = new HashMap<>();
        HashMap<Character, Integer> word = new HashMap<>();
        
        for(char c : chars.toCharArray()){
            charmap.put(c,charmap.getOrDefault(c, 0)+1);
        }
        
        
        for(int i=0;i<n;i++){
            String w = words[i];
            int len = w.length();
            
            for(Character c: w.toCharArray()){
                word.put(c,word.getOrDefault(c,0)+1);
            }
            
            // flag to check frequency
            boolean flag = true;
            for(char c : w.toCharArray()){
                if(charmap.containsKey(c)){
                    if(charmap.get(c) < word.get(c))
                    {
                    flag = false;
                    break;
                    }
                }else{
                    flag = false;
                    break;
                }
                
            }

            word.clear();
            
            if(flag){
                sum += len;
            }
    }
        
    return sum;
}
}