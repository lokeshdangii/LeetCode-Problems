class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int arr[] = new int[heights.length];

        for(int i=0;i<n;i++){
            arr[i] = heights[i];
        }   
        

        int ans = 0;
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(heights[i]!=arr[i]){
                ans += 1;
            }
        }

        return ans;
    }
}