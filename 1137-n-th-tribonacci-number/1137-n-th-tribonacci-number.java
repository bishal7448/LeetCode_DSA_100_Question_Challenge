class Solution {
    public int tribonacci(int n) {
        if(n == 0) {
            return 0;
        }else if(n == 1) {
            return 1;
        }else if(n == 2) {
            return 1;
        }

        int ft = 0;
        int st = 1;
        int tt = 1;

        for(int i = 2; i < n; i++) {
            int fot = ft + st + tt;
            ft = st;
            st = tt;
            tt = fot;
        }

        return tt;
    }
}