class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time = 0;
        double waiting = 0;

        for(int customer[] : customers){
            if(customer[0]<time){
                time += customer[1];
            }else{
                time = customer[0] + customer[1];
            }

            waiting += time - customer[0];
        }

        return waiting/customers.length;
    }
}