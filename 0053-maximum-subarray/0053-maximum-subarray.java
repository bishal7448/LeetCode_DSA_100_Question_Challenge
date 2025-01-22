class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        int i = 1;
        while (i <= nums.length - 1) {
            if (currSum + nums[i] > nums[i]) {

                currSum = currSum + nums[i];
            }else {

                currSum = nums[i];
            }

            maxSum = Math.max(currSum, maxSum);

            i++;
        }

        return maxSum;
    }
}