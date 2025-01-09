/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
    let range = nums.length;

    let actVal = (range * (range + 1)) / 2;

    let calVal = 0;

    for (let i = 0; i < nums.length; i++) {
        calVal += nums[i];
    }

    let ans = actVal - calVal;

    return ans;
};