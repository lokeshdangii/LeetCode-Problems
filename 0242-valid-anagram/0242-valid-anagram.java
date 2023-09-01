class Solution {
    public boolean isAnagram(String a, String b) {
      
        if(a.length() != b.length()){
            return false;
        }
        
        char[] a1 = a.toCharArray();
        Arrays.sort(a1);
        a = new String(a1);
        
        char[] b1 = b.toCharArray();
        Arrays.sort(b1);
        b = new String(b1);
        
        return a.equals(b);
    }
}