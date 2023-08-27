class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length -1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(startRow <= endRow && startCol <= endCol){
            
            // top

            for(int j=startCol;j<=endCol;j++){
                result.add(matrix[startRow][j]);
            }
           
            // Right
            
            for(int i=startRow+1;i<=endRow;i++){
                result.add((matrix[i][endCol]));
            }
            
            // Bottom
            
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                result.add(matrix[endRow][j]);
            }
    
            // left
            
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                break;
            }
                result.add(matrix[i][startCol]);
            }
            
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        
        return result;
    }
}