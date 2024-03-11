public class Solution {
    public String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            int cnt = countOccurrences(s, c);
            for (int j = 0; j < cnt; j++) {
                result.append(c);
            }
            s = s.replace(String.valueOf(c), "");
        }
        result.append(s);
        return result.toString();
    }
    
    private int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
