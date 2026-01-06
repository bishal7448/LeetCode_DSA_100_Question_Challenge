class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1) {
            return false;
        } else if( n == 1) {
            return true;
        } else {
            if(n % 2 == 0) {

                while(n % 2 == 0) {
                    n /= 2;
                }

                if( n == 1) {
                    return true;
                }

                return false;
            }

            return false;
        }
    }
}