class Solution {
    public int strStr(String txt, String pattern) {
        int m = pattern.length();
        int n = txt.length();


        for(int i=0;i<=n-m;i++){
            int j;

            for(j=0;j<m;j++){

                if(pattern.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }

             if(j==m){
                return i;
                }
            
        }

        return -1;
    }
}