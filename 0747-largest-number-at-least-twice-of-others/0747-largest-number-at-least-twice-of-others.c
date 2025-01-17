int dominantIndex(int* nums, int numsSize) {
    int f_Max = -1;
    int s_Max = -1;
    int ans = 0;

    for (int i = 0; i < numsSize; i++) {
        int val = nums[i];

        if (f_Max < val) {
            s_Max = f_Max;
            f_Max = val;
            ans = i;
        } else if (s_Max < val) {
            s_Max = val;
        }
    }

    if (f_Max >= s_Max * 2) {
        return ans;
    }

    return -1;
}