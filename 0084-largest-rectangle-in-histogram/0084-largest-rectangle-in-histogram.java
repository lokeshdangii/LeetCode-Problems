class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int nextSmallerLeft[] = new int[n];
        int nextSmallerRight[] = new int[n];
        
        Stack<Integer> s = new Stack<>();
        
        //Next Smaller Right
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }          
            if(s.isEmpty()){
                nextSmallerRight[i] = n;
            }else{
                nextSmallerRight[i] = s.peek();
            }            
            s.push(i);   //pushing index in the stack
        }
        
        s = new Stack<>();  // empty the stack
        //Next Smaller Left
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }            
            if(s.isEmpty()){
                nextSmallerLeft[i] = -1;
            }else{
                nextSmallerLeft[i] = s.peek();
            }           
            s.push(i);
        }
         
        // Calculate Area
        // width = j-i-1 --> nextSmallerRight[i] - nextSmallerLeft[i] -1
        for(int i=0;i<n;i++){
            int height = heights[i];
            int width = (nextSmallerRight[i] - nextSmallerLeft[i]) - 1;
            int currArea = height * width;
            
            maxArea = Math.max(currArea,maxArea);
        }
        
        return maxArea;
        
    }
}