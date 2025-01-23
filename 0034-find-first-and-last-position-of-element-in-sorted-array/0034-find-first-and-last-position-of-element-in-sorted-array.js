/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function (nums, target) {
    let ans = [-1, -1];

    let first = firstApp(nums, target);
    let last = lastApp(nums, target);

    if (nums.length === 0) {

        return ans;
    } else {

        ans[0] = first;
        ans[1] = last;
    }

    return ans;
};

var firstApp = function (nums, target) {

    let ans = -1;

    let start = 0;
    let end = nums.length - 1;

    while (start <= end) {

        let mid = Math.floor((start + end) / 2);

        if (nums[mid] === target) {

            ans = mid;
            end = mid - 1;
        } else if (nums[mid] < target) {

            start = mid + 1;
        } else {

            end = mid - 1;
        }
    }

    return ans;
}

var lastApp = function (nums, target) {

    let ans = -1;

    let start = 0;
    let end = nums.length - 1;

    while (start <= end) {

        let mid = Math.floor((start + end) / 2);

        if (nums[mid] === target) {

            ans = mid;
            start = mid + 1;
        } else if (nums[mid] < target) {

            start = mid + 1;
        } else {

            end = mid - 1;
        }
    }

    return ans;
}