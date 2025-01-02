/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
    const merge = (arr1, arr2) => {
        const arr3 = new Array(arr1.length + arr2.length);

        let p1 = 0;
        let p2 = 0;
        let p3 = 0;

        while (p1 < arr1.length || p2 < arr2.length) {
            const val1 = p1 < arr1.length ? arr1[p1] : Infinity;
            const val2 = p2 < arr2.length ? arr2[p2] : Infinity;

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
    };

    const arr3 = merge(nums1, nums2);

    if (arr3.length % 2 === 0) {
        return (arr3[arr3.length / 2] + arr3[arr3.length / 2 - 1]) / 2;
    } else {
        return arr3[Math.floor(arr3.length / 2)];
    }
};