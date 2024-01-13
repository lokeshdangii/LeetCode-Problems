class Solution {
    public void reverseString(char[] s) {
        String rev = "";
        Stack<Character> stake = new Stack<>();
        
        for(char c : s){
            stake.push(c);
        }
         
        int i = 0;
        while(!stake.isEmpty()){
            s[i] = stake.pop();
            i++;
        }
        
    }
}