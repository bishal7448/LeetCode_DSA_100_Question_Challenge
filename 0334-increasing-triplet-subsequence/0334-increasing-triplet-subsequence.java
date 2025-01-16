class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (first >= val) {
                first = val;
            } else if (second >= val) {
                second = val;
            } else {
                third = val;
                return true;
            }
        }

        return false;
    }
}