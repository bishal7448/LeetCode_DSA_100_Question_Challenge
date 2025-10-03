class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }else {
            int realNum = x;
            int revNum = 0;

            int temp = realNum;
            while(temp > 0) {
                int rem = temp % 10;
                temp = temp / 10;

                revNum = revNum * 10 + rem;
            }

            if(realNum == revNum) {
                return true;
            }
        }

        return false;
    }
}