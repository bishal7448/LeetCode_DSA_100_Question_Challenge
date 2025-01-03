void merge(int* arr1, int len1, int* arr2, int len2, int* arr3);

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int nums3Size = nums1Size + nums2Size;
    int nums3[nums3Size]; // Merged Array

    merge(nums1, nums1Size, nums2, nums2Size, nums3);

    if (nums3Size % 2 == 0) {
        double ans = (double)(nums3[nums3Size / 2] + nums3[nums3Size / 2 - 1]) / 2;
        return ans;
    } else {
        double ans = (double)(nums3[nums3Size / 2]);
        return ans;
    }
}

void merge(int* arr1, int len1, int* arr2, int len2, int* arr3) {
    int p1 = 0;
    int p2 = 0;
    int p3 = 0;

    while (p1 < len1 || p2 < len2) {
        int val1 = p1 < len1 ? arr1[p1] : INT_MAX;
        int val2 = p2 < len2 ? arr2[p2] : INT_MAX;

        if (val1 < val2) {
            arr3[p3] = val1;
            p1++;
        } else {
            arr3[p3] = val2;
            p2++;
        }

        p3++;
    }
}
