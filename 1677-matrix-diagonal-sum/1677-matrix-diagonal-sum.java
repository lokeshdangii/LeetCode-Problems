class Solution {
    public int diagonalSum(int[][] matrix) {
        	//Write your code here 
		int n = matrix.length;
		int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        int j= n-1;
        for(int i=0;i<n;i++){
            
            leftSum += matrix[i][i];
            rightSum += matrix[i][j];
            j--;
        }
        
        totalSum = leftSum + rightSum;
        
        if(n%2 != 0){
            int index = (int) n/2;
            int mid = matrix[index][index];
            totalSum -= mid;
        }
        
        
        return totalSum;
    }
}