class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;

        // list to store numbers from 1 to n
        ArrayList <Integer> numbers = new ArrayList<> ();

        // 
        for(int i=1;i<n;i++){
            fact = fact * i;
            numbers.add(i);
        }

        numbers.add(n);

        // string to store required sequence
        String ans = "";
        k = k-1;

        while(true){
            // storing a number in ans
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);  // removing after storing so that it will not repeat again

            if(numbers.size() == 0){
                break;
            }

            // Decrementing k
            k = k%fact;
            fact = fact/numbers.size();

        }

        return ans;
        
    }
}