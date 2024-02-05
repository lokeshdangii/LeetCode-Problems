class Solution {
    public int firstUniqChar(String S) {
        int count[] = new int [256];
       for(int i=0;i<S.length();i++){
            count[S.charAt(i)]++;
       }
       
       for(int i=0;i<S.length();i++){
           if(count[S.charAt(i)] == 1)
           return i;
       }
       
       return -1;
    }
}