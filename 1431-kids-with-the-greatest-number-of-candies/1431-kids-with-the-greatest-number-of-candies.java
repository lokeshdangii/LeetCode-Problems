class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // List to store result
        ArrayList<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = 0;

        // for loop to get max;
        for(int candy : candies)
            max = candy > max ? candy : max;
        
        
        for(int i=0;i<n;i++){
            
            int total_candy = candies[i] + extraCandies;
            
            if(total_candy >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        
        
        return result;
    }
}