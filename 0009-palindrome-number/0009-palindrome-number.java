class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) {
            return false;        
        }else {
            int realNum = x;
            int revNum = 0;

            while(x > 0) {
                int temp = x % 10;
                revNum = revNum * 10 + temp;
                x /= 10;
            }

            if(realNum == revNum) {
                return true;
            }
        }

        return false;
    }
}