class Solution {
    public boolean isSubsequence(String A, String B) {
         int m = A.length();
        int n = B.length();
        
        int j = 0;
        
        for(int i=0;i<n && j<m;i++){
            if(B.charAt(i) == A.charAt(j)){
                j++;
            }
        }
        
        return (j==m);
    }
}