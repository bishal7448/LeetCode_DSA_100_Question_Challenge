class Solution {
    public int maxSum(int[] nums) {

        // check if all are negative
        int mn = Integer.MIN_VALUE;
        boolean pos = false;
        for (int val : nums) {
            if (val > 0) {
                pos = true;
                break;
            }
            mn = Math.max(mn, val);
        }

        if (!pos) {
            return mn;
        }

        // else answer will always a positive number or 0
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int val : nums) {
            if (val >= 0) {
                if (!set.contains(val)) {
                    if (val >= 0) {
                        sum += val;
                    }
                }

                set.add(val);
            }
        }

        return sum;
    }
}