class Solution {
    public int[][] transpose(int[][] a) {

       int n = a.length;       
        int m = a[0].length;    
        
        int[][] result = new int[m][n];  

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = a[i][j]; 
            }
        }

        return result;

    }
}