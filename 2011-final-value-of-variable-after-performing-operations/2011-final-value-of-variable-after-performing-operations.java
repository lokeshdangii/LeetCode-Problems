class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int x = 0;
        
        for(int i=0;i<n;i++){
            
            String str = operations[i];
            
            if ("--X".equals(str) || "X--".equals(str))
                x--;

            if ("X++".equals(str) || "++X".equals(str))
                x++;
            
        }
        
        return x;
    }
}