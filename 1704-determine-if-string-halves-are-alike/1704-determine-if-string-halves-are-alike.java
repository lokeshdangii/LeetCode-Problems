class Solution {
    
    public boolean checkVowel(char c){
        HashSet <Character> hs = new HashSet<Character>();
        hs.add('a'); hs.add('e'); hs.add('i'); hs.add('o'); hs.add('u');
        hs.add('A'); hs.add('E'); hs.add('I'); hs.add('O'); hs.add('U');
        
        if(hs.contains(c)){
            return true;
        }else{
            return false;
        }
    }
    public boolean halvesAreAlike(String s) {
        int left_vowels = 0;
        int right_vowels = 0;
        
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
            if(checkVowel(s.charAt(i))){
                left_vowels++;
            }
            
            if(checkVowel(s.charAt(j))){
                right_vowels++;
            }

            i++;
            j--;
        }
        
        if(left_vowels == right_vowels){
            return true;
        }
        
        return false;
    }
}