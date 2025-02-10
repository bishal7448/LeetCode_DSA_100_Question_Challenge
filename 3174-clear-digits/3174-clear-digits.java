class Solution {
    public String clearDigits(String s) {
        Stack<Character> nm = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                nm.pop();
            } else {
                nm.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!nm.isEmpty()) {
            ans.insert(0, nm.pop());
        }
        return ans.toString();
    }
}