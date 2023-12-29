class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for (String str : word1){
            s1 = s1.concat(str);
        }

        for (String str : word2){
            s2 = s2.concat(str);
        }

        return s1.equals(s2);
    }
}

/*
StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        
        for (String str : word1) {
            w1.append(str);
        }
        
        for (String str : word2) {
            w2.append(str);
        }
        
        return w1.toString().equals(w2.toString()); 
*/