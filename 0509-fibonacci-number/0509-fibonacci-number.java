class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }else if(n == 1) {
            return 1;
        } else {
            int f = 0;
            int s = 1;
            while(n > 1) {
                int t = f + s;
                f = s;
                s = t;
                n--;
            }

            return s;
        }
    }
}