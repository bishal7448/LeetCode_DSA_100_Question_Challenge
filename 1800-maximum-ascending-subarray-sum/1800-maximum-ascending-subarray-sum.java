class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;

        int sum = nums[0];
        int temp = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                temp += nums[i];
            } else {
                sum = Math.max(sum, temp);
                temp = nums[i];
            }
        }

        sum = Math.max(sum, temp);

        return sum;
    }
}