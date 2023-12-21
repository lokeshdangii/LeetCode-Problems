class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        
        int ans = 0;
        for (int i = 1; i < points.length; i++) {
            ans = Math.max(ans, points[i][0] - points[i - 1][0]);
        }
        
        return ans;
    }
}

/*

Algorithm:-

1. Sort the array points in ascending order of x-coordinates.
2. Initialize the variable ans to 0, this will store the widest vertical area which is the answer to the    problem.
3. Iterate over points from index 1 and store the maximum of points[i][0] - points[i - 1][0] in ans.
4. Return ans.


*/