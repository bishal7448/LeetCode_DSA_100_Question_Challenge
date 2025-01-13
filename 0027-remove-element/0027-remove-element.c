int removeElement(int* nums, int numsSize, int val) {
    int k = 0;
    int p = 0; // Pointer

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != val) {
            nums[p] = nums[i];
            p++;
            k++;
        }
    }

    return k;
}