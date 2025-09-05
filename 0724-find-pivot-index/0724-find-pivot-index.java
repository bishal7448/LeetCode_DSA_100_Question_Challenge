class Solution {
    public int pivotIndex(int[] nums) {
        int rSum = 0;

        for(int ele : nums) {
            rSum += ele;
        }

        int lSum = 0;
        int ans = -1;

        for(int i = 0; i < nums.length; i++) {
            rSum -= nums[i];

            if(lSum == rSum) {
                ans = i;
                break;
            }else {
                lSum += nums[i];
            }
        }

        return ans;
    }
}