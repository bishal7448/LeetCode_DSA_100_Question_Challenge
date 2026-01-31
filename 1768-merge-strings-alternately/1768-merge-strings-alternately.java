class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder for efficient string concatenation
        StringBuilder ans = new StringBuilder();

        int i = 0;

        // Merge characters alternately while both strings have characters
        while (i < word1.length() && i < word2.length()) {
            ans.append(word1.charAt(i)); // add char from word1
            ans.append(word2.charAt(i)); // add char from word2
            i++;
        }

        // Append remaining characters from word1 (if any)
        while (i < word1.length()) {
            ans.append(word1.charAt(i++));
        }

        // Append remaining characters from word2 (if any)
        while (i < word2.length()) {
            ans.append(word2.charAt(i++));
        }

        // Convert StringBuilder to String and return result
        return ans.toString();
    }
}
