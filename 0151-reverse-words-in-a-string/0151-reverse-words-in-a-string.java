class Solution {
    public String reverseWords(String s) {
        String[] all = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i = all.length - 1; i >= 0; i--) {
            sb.append(all[i] + " ");
        }

        return sb.toString().trim();
    }
}