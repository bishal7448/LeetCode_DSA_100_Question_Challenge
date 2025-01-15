class Solution {
    public int dominantIndex(int[] nums) {
        int f_Max = -1;
        int s_Max = -1;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (f_Max < val) {
                s_Max = f_Max;
                f_Max = val;
                index = i;
            } else if (s_Max < val) {
                s_Max = val;
            }

        }

        if (f_Max >= s_Max * 2) {
            return index;
        } else {
            return -1;
        }
    }
}