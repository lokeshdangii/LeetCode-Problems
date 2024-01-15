class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> Loser = new HashMap<>();
        HashMap<Integer,Integer> Winner = new HashMap<>();
        
        //populating loser map
        for(int i=0;i<matches.length;i++){
            Loser.put(matches[i][1], Loser.getOrDefault(matches[i][1], 0) + 1);
        }
        
        // populating winner map
        for(int i=0;i<matches.length;i++){
            if(!Loser.containsKey(matches[i][0])){
                Winner.put(matches[i][0],0);
            }
        }
        
        List<Integer> List1 = new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();
       
        // populating List 1 with all players that have not lost any matches.
        HashSet<Integer> hsw = new HashSet<>(Winner.keySet());
        for(int ele : hsw ){
            List1.add(ele);
        }
        
        // populating List2 with all players that have lost exactly one match.
        HashSet<Integer> hsl = new HashSet<>(Loser.keySet());
        for(int ele : hsl ){
            if(Loser.get(ele) == 1){
                List2.add(ele);
            } 
        }
        
        // Sorting both the lists
        Collections.sort(List1);
        Collections.sort(List2);
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(List1);
        result.add(List2);

        return result;
        
    }
}