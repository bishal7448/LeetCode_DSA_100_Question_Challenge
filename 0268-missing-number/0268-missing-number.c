int missingNumber(int* nums, int numsSize) {
    int actVal = (numsSize * (numsSize + 1)) / 2;

    int calVal = 0;

    for(int i = 0; i < numsSize; i++) {
        calVal += nums[i];
    }

    int ans = actVal - calVal;

    return ans;
}