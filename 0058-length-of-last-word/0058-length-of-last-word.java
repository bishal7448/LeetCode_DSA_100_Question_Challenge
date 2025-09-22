class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                len++;
            }else if(len != 0) {
                break;
            }
        }

        return len;
    }
}