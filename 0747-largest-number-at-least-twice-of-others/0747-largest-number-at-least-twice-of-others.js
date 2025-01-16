/**
 * @param {number[]} nums
 * @return {number}
 */
var dominantIndex = function (nums) {
    let fMax = -1;
    let sMax = -1;
    let ans = -1;

    for (let i = 0; i < nums.length; i++) {
        let val = nums[i];

        if (fMax < val) {
            sMax = fMax;
            fMax = val;
            ans = i
        } else if (sMax < val) {
            sMax = val;
        }

    }

    if (fMax >= sMax * 2) {
        return ans;
    } else {
        return -1;
    }

    return -1;
};