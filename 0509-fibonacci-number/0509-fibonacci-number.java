class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }else if(n == 1) {
            return 1;
        }else {
            int fst = 0;
            int sndt = 1;
            int trdt = 0;

            for(int i = 1; i < n; i++) {
                trdt = fst + sndt;
                fst = sndt;
                sndt = trdt;
            }

            return trdt;
        }
    }
}