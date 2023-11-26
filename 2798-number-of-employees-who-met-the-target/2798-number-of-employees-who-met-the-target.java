class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        // number of employees
        int noe = 0;
        
        for(int i=0;i<hours.length;i++){
            if(hours[i] >= target)
                noe++;
        }
        
        return noe;
    }
}