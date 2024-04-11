class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        
        for(char digit : num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        // Removing remaining k digits from the end of stack
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        //resulting string
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        sb.reverse(); // reverse to get correct order
        
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.length()>0 ? sb.toString() : "0";
    }
    
    
}