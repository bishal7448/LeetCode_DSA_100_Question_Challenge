class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr3 = merge(nums1, nums2);

        if (arr3.length % 2 == 0) {
            double ans = (double) (arr3[arr3.length / 2] + arr3[arr3.length / 2 - 1]) / 2;
            return ans;
        } else {
            double ans = (double) (arr3[arr3.length / 2]);
            return ans;
        }
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if (val1 < val2) {
                arr3[p3] = val1;
                p1++;
            } else {
                arr3[p3] = val2;
                p2++;
            }

            p3++;
        }

        return arr3;
    }
}