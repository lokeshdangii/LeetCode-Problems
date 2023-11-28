class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int m = accounts.length; // row
        int n = accounts[0].length; // column
        int maximum = 0;
        
        for(int i=0;i<m;i++){
            int wealth = 0;
            for(int j=0;j<n;j++){
                
                wealth += accounts[i][j];
                
                
            }
            
            maximum = Math.max(wealth,maximum);
        }
        
        return maximum;
    }
}