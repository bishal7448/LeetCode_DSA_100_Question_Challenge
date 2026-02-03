class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        int len = chars.length;

        while (read < len) {
            char iniChar = chars[read];

            int count = 0;

            while (read < len && chars[read] == iniChar) {
                count++;
                read++;
            }

            chars[write++] = iniChar;

            if (count > 1) {
                for (char ch : String.valueOf(count).toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        return write;
    }
}