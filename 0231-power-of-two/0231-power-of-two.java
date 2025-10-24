class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1) {
            return false;
        }else if(n == 1) {
            return true;
        }else {
            if(n % 2 == 0) {
                int check = 0;

                while(n % 2 == 0) {
                    check = n / 2;
                    n /= 2;
                }

                if(check == 1) {
                    return true;
                }
            }

            return false;
        }
    }
}