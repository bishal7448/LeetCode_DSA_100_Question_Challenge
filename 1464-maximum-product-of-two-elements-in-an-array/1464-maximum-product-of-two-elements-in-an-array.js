/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function (nums) {
    let max = -1;
    let sMax = -1;

    for (let i = 0; i < nums.length; i++) {
        if (max < nums[i]) {
            sMax = max;
            max = nums[i];
        } else if (sMax < nums[i]) {
            sMax = nums[i];
        }
    }

    let ans = (max - 1) * (sMax - 1);

    return ans;
};