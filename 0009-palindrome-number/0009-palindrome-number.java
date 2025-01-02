class Solution {
    public boolean isPalindrome(int x) {    
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int realnum = x;
        int revnum = 0;

        while (x > 0) {
            int remnum = x % 10;
            revnum = revnum * 10 + remnum;
            x /= 10;
        }

        if (revnum == realnum) {
            return true;
        }

        return false;
    }
}