class Solution {
    public long minOperations(int[][] queries) {
        long totalResult = 0;

        for (int[] q : queries) {
            int l = q[0], r = q[1];
            long totalSteps = 0;

            long base = 1;
            int step = 1;

            while (base <= r) {
                long left = Math.max(l, base);
                long right = Math.min(r, base * 4 - 1);

                if (left <= right) {
                    long count = right - left + 1;
                    totalSteps += count * step;
                }

                base *= 4;
                step++;
            }

            totalResult += (totalSteps + 1) / 2;
        }

        return totalResult;
    }
}