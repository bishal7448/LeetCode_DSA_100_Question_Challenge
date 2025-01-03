class Solution {
    public int waysToSplitArray(int[] nums) {
        long right = 0;
        long left = 0;
        for (int i : nums) {
            right += i;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            right -= nums[i];
            left += nums[i];
            if (left >= right) {
                count++;
            }
        }
        return count;
    }
}