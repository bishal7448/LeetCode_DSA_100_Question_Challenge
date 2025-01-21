/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function (nums) {
    let len = nums.length;

    if (len === 1) {

        return nums[0];
    } else if (nums[0] < nums[len - 1]) {

        return nums[0];
    } else {
        let start = 0;
        let end = len - 1;

        while (start <= end) {
            let mid = (start + end) / 2;

            if (mid != 0 && nums[mid] < nums[mid - 1]) {

                return nums[mid];
            } else if (mid != (len -1) && nums[mid] > nums[mid + 1]) {

                return nums[mid + 1];
            } else if (nums[start] < nums[mid]) {

                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }
    }

    return -1;
};