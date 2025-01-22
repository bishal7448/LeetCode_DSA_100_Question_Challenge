/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function (nums) {

    let len = nums.length;

    if (len === 1) {

        return nums[0];
    } else if (nums[0] !== nums[1]) {

        return nums[0];
    } else if (nums[len - 1] !== nums[len - 2]) {

        return nums[len - 1];
    } else {

        let start = 0;
        let end = len - 1;

        while (start <= end) {

            let mid = Math.floor((start + end) / 2);

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {

                return nums[mid];
            } else if (mid % 2 === 1) {

                if (nums[mid] === nums[mid - 1]) {

                    start = mid + 1;
                } else {

                    end = mid - 1;
                }
            } else {

                if (nums[mid] === nums[mid + 1]) {

                    start = mid + 1;
                } else {

                    end = mid - 1;
                }
            }
        }
    }

    return -1;
};