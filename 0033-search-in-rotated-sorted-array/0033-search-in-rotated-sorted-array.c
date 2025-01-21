int search(int* nums, int numsSize, int target) {
    int len = numsSize;

    int start = 0;
    int end = len - 1;

    while (start <= end) {
        int mid = (start + end) / 2;

        if (nums[mid] == target) {

            return mid;
        } else if (nums[start] <= nums[mid]) {

            if (nums[start] <= target && target < nums[mid]) {

                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {

            if (nums[mid] < target && target <= nums[end]) {

                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }
    }

    return -1;
}