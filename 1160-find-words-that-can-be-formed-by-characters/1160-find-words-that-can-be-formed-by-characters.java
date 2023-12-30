class Solution {
    public int countCharacters(String[] words, String chars) {
        // Get the number of words and the length of the characters string
        int n = words.length;
        int m = chars.length();

        // Initialize the sum variable to store the total length of good strings
        int sum = 0;

        // HashMap to store the frequency of characters in the chars string
        HashMap<Character, Integer> charmap = new HashMap<>();

        // HashMap to store the frequency of characters in the current word
        HashMap<Character, Integer> word = new HashMap<>();

        // Populate charmap with the frequency of characters in the chars string
        for (char c : chars.toCharArray()) {
            charmap.put(c, charmap.getOrDefault(c, 0) + 1);
        }

        // Iterate through each word in the words array
        for (int i = 0; i < n; i++) {
            // Get the current word and its length
            String w = words[i];
            int len = w.length();

            // Populate the word HashMap with the frequency of characters in the current word
            for (Character c : w.toCharArray()) {
                word.put(c, word.getOrDefault(c, 0) + 1);
            }

            // Flag to check if the current word can be formed by characters from chars
            boolean flag = true;

            // Iterate through each character in the current word
            for (char c : w.toCharArray()) {
                // Check if charmap contains the current character
                if (charmap.containsKey(c)) {
                    // Check if the frequency of the current character in chars is sufficient
                    if (charmap.get(c) < word.get(c)) {
                        flag = false; // Set flag to false if frequency is insufficient
                        break;
                    }
                } else {
                    flag = false; // Set flag to false if the character is not present in chars
                    break;
                }
            }

            // Clear the word HashMap for the next iteration
            word.clear();

            // If the word is good (can be formed by characters from chars), add its length to sum
            if (flag) {
                sum += len;
            }
        }

        // Return the total length of good strings
        return sum;
    }
}
