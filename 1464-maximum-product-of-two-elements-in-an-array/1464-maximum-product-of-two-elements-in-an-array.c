int maxProduct(int* nums, int numsSize) {
    int fmax = -1;
    int smax = -1;

    for (int i = 0; i < numsSize; i++) {
        if (fmax < nums[i]) {
            smax = fmax;
            fmax = nums[i];
        } else if (smax < nums[i]) {
            smax = nums[i];
        }
    }

    int ans = (fmax - 1) * (smax - 1);

    return ans;
}