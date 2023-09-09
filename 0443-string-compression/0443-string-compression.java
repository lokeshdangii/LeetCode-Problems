class Solution {
    public int compress(char[] chars) {
        String s = "";

        
        for (int i=0;i<chars.length;i++){
            Integer count =1;
            while(i<chars.length-1 && chars[i] == chars[i+1]){
                count ++;
                i++;
            }

            s += chars[i];
            if(count>1){
                s += count.toString();
            }

        }

        char strArr[] = s.toCharArray(); 
        for(int i=0;i<strArr.length;i++){
            chars[i] = strArr[i];
        }

        return s.length();
    }
}