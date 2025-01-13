/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
    let len = nums.length;

    let right = [];
    right.length = len;

    let pro = 1;

    for (let i = len - 1; i >= 0; i--) {
        pro = pro * nums[i];
        right[i] = pro;
    }

    let ans = [];
    ans.length = len;

    let left = 1;

    let i = 0;

    while (i < len - 1) {
        let pro = left * right[i + 1];
        ans[i] = pro;
        left = left * nums[i];
        i++;
    }

    ans[len -1] = left;

    return ans;
};