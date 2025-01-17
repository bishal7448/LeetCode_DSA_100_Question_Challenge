/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAscendingSum = function (nums) {
    let currMax = nums[0];
    let actMax = nums[0];

    for (let i = 1; i < nums.length; i++) {
        let preVal = nums[i - 1];
        let val = nums[i];

        if (preVal < val) {
            currMax += val;
        } else {
            actMax = Math.max(currMax, actMax);

            currMax = val;
        }

        actMax = Math.max(currMax, actMax);
    }

    return actMax;
};