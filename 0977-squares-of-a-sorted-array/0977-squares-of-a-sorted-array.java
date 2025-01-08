class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int p1 = 0;
        int p2 = nums.length - 1;
        int p3 = ans.length - 1;

        while (p3 > -1) {
            int val1 = nums[p1] * nums[p1];
            int val2 = nums[p2] * nums[p2];

            if (val1 > val2) {
                ans[p3] = val1;
                p1++;
            } else {
                ans[p3] = val2;
                p2--;
            }

            p3--;
        }

        return ans;
    }
}