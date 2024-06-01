class Solution {
    
    static class Row implements Comparable<Row>{
        int index;
        int soldier;
        
        Row(int index,int soldier){
            this.index = index;
            this.soldier = soldier;
        }
        
        @Override
        public int compareTo(Row other){
            if(this.soldier == other.soldier){
                return this.index - other.index;
            }else{
                return this.soldier-other.soldier;
            }
        }
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();   
        int m = mat.length;
        
        for(int i=0;i<m;i++){
            int soldiers = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    soldiers++;
                }
            }
            
            pq.add(new Row(i,soldiers));
        }
        
        int result[] = new int[k];
        
        for(int i=0;i<k;i++){
            result[i] = pq.remove().index;
        }
        
        
        return result;
    }
}