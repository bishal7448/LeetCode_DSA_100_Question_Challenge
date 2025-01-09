class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] rightArr = new int[n];

        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            right *= nums[i];
            rightArr[i] = right;
        }

        int[] ansArr = new int[n];

        int left = 1;

        for (int i = 0; i < n - 1; i++) {
            int pro = left * rightArr[i + 1];

            ansArr[i] = pro;

            left *= nums[i];
        }

        ansArr[n - 1] = left;

        return ansArr;
    }
}