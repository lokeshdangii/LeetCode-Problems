class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        int start = 0;
        int end = n-1;

        while(start < end){
            int heightt = Math.min(height[start], height[end]);
            int width = end - start;
            int currWater = width * heightt;
            maxWater = Math.max(maxWater,currWater);

        // shifting from either left or right
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }

        return maxWater;
    }
}


// Brute Force Approach

// public int maxArea(int[] height) {
//         int n = height.length;
//         int maxWater = 0;

//         for(int i=0;i<n;i++){
//             for (int j=i+1;j<n;j++){
//                 int heightt = Math.min(height[i], height[j]);
//                 int width = j-i;
//                 int currWater = width * heightt;
//                 maxWater = Math.max(maxWater,currWater);
//             }
//         }

//         return maxWater;
//     }