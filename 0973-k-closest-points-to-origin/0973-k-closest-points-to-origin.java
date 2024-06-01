class Solution {
    
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        
        Point(int x, int y, int distSq){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }
        
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }
    
    
    public int[][] kClosest(int[][] points, int k) {
        
        int result [][] = new int[k][2];
        
        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        for(int i=0;i<points.length;i++){
            int distSq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Point(points[i][0], points[i][1], distSq));
                
        }
        
        for(int i=0;i<k;i++){
            result[i][0] = pq.peek().x;
            result[i][1] = pq.peek().y;
            pq.remove();
        }
        
        return result;
        
    }
}