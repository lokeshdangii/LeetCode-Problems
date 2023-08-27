class Solution {
    public int[][] generateMatrix(int n) {

        int result[][] =  new int[n][n];
        int ele = 1;

        int startRow = 0;
        int endRow =  n-1;
        int startCol = 0;
        int endCol = n-1;
  
        while(startRow <= endRow && startCol <= endCol){
            
            // top

            for(int j=startCol;j<=endCol;j++){
                result[startRow][j] = ele;
                ele++;
            }
           
            // Right
            
            for(int i=startRow+1;i<=endRow;i++){
                result[i][endCol] = ele;
                ele++;
            }
            
            // Bottom
            
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                result[endRow][j] = ele;
                ele++;
            }
    
            // left
            
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                break;
            }
                result[i][startCol] = ele;
                ele++;
            }
            
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        
        return result;
    }
}