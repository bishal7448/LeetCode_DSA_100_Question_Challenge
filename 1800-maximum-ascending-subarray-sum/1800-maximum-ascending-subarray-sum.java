class Solution {
    public int maxAscendingSum(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int prevVal = nums[i - 1];
            int val = nums[i];

            if (prevVal < val) {
                currSum += val;
            } else {
                maxSum = Math.max(currSum, maxSum);

                currSum = val;
            }
        }

        maxSum = Math.max(currSum, maxSum);

        return maxSum;       
    }
}