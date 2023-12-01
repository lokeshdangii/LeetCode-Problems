class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int maxnum = 0;

        for (int i = 0; i < n; i++) {
            String s = sentences[i];
            int wordCount = 0;

            // Count words in the current sentence
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    wordCount++;
                }
            }

            // To Count the last word
            wordCount++;

            // Update the maximum word count
            maxnum = Math.max(maxnum, wordCount);
        }

        return maxnum;
    }
}
