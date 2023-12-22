class Solution {
    public int maxScore(String s) {
        
        int maximum_score = 0;
        int n = s.length();
        
        // loop for each combination of string
        for(int i=0;i<n-1;i++){
            String left = s.substring(0,i+1);
            String right = s.substring(i+1,n); 
            
            int left_score = 0;
            int right_score =0;
            
            int total_score = 0;
            
            // looping on left
            for(int idx=0;idx<left.length();idx++){
                if(left.charAt(idx) == '0'){
                    left_score++;
                }
            }
            
            // looping on right
            for(int j=0;j<right.length();j++){
                if(right.charAt(j) == '1'){
                    right_score++;
                }
            }
            
            total_score = left_score + right_score;
            
            maximum_score = Math.max(maximum_score,total_score);
        }
        
        return maximum_score;
        
    }
}