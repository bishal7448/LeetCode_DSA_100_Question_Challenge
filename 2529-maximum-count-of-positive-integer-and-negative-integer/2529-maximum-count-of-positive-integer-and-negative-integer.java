class Solution {
    public int maximumCount(int[] nums) {
        int negNum = lastNegIntIndx(nums) + 1;
        int posNum = nums.length - firstPosIntIndx(nums);

        // int ans = negNum > posNum ? negNum : posNum;

        return Math.max(negNum, posNum);
    }

    public int lastNegIntIndx(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] >= 0) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }

    public int firstPosIntIndx(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid] <= 0) {
                start = mid + 1;
            }else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}