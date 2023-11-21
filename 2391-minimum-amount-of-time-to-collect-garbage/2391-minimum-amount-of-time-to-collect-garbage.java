class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int result = 0;

        int metal_time = 0;
        int paper_time = 0;
        int glass_time = 0;

        // last occurences
        int metal_last = 0;
        int paper_last = 0;
        int glass_last = 0;

        // time minus
        int metal_minus = 0;
        int paper_minus = 0;
        int glass_minus = 0;

        for(int i=0;i<n;i++){
            // time 
           int time = (i == 0) ? 0 : travel[i - 1];
           int metal_count = 0;
           int paper_count = 0;
           int glass_count = 0;
           
            // loop to iterate of string    
           String str = garbage[i];
           for(int j=0;j<str.length();j++){
               if(str.charAt(j)=='M'){ metal_count += 1;  }
               if(str.charAt(j)=='P'){ paper_count += 1; }
               if(str.charAt(j)=='G'){ glass_count += 1; }
           }

           if(metal_count != 0){
               metal_time += metal_count;
               metal_last = i;
           }

           if(paper_count != 0){
               paper_time += paper_count;
               paper_last = i;
           }

           if(glass_count != 0){
               glass_time += glass_count;
               glass_last = i;
           }

           metal_time += time;
           paper_time += time;
           glass_time += time;

        }

        // metal_minus
        for(int i=metal_last;i<travel.length;i++){
            metal_minus += travel[i];
        }

        // paper_minus
        for(int i=paper_last;i<travel.length;i++){
            paper_minus += travel[i];
        }

        // glass_minus
        for(int i=glass_last;i<travel.length;i++){
            glass_minus += travel[i];
        }

        metal_time -= metal_minus;
        paper_time -= paper_minus;
        glass_time -= glass_minus;

        result = metal_time + paper_time + glass_time;

        return result;
    }
}



// My Solution 
/*
public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int result = 0;

        int metal_time = 0;
        int paper_time = 0;
        int glass_time = 0;

        for(int i=0;i<n;i++){
            // time 
           int time = (i == 0) ? 0 : travel[i - 1];
           int metal_count = 0;
           int paper_count = 0;
           int glass_count = 0;
           
            // loop to iterate of string    
           String str = garbage[i];
           for(int j=0;j<str.length();j++){
               if(str.charAt(j)=='M'){ metal_count += 1;  }
               if(str.charAt(j)=='P'){ paper_count += 1; }
               if(str.charAt(j)=='G'){ glass_count += 1; }
           }

           if(metal_count != 0){
               metal_time += metal_count + time;
           }

           if(paper_count != 0){
               paper_time += paper_count + time;
           }

           if(glass_count != 0){
               glass_time += glass_count + time;
           }
        }

        result = metal_time + paper_time + glass_time;

        return result;
    } 
*/