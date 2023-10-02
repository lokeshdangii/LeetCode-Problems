class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        if(n == 1 && n==2){
            return false;
        }

        int Alice_count = 0;
        int Bob_count = 0;

        for(int i=1;i<n-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1)){
                Alice_count++;
            }
            

            if(colors.charAt(i)=='B' && colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1)){
                Bob_count++;
            }
        }

        if(Alice_count > Bob_count){
            return true;
        }else{
            return false;
        }
    }
}