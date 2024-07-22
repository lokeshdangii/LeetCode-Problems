class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        String result[] = new String[n];
        
        // HashMap to store height and name
        HashMap <Integer,String> hm = new HashMap<>();
        
        // Loop to store data in map
        for(int i=0;i<n;i++){
            hm.put(heights[i],names[i]);
        }
        
        // sorting the array
        Arrays.sort(heights);
        
        int idx = 0;
        for(int i=n-1;i>=0;i--){
            result[idx] = hm.get(heights[i]);
            idx++;
        }
        
        return result;
        
    }
}