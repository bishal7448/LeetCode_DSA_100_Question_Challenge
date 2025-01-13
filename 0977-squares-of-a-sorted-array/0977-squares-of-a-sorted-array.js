/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
    let ans = [];
    ans.length = nums.length

    let p1 = 0;
    let p2 = nums.length - 1;

    for (let i = nums.length - 1; i >= 0; i--) {
        let val1 = nums[p1] * nums[p1];
        let val2 = nums[p2] * nums[p2];

        if (val1 < val2) {
            ans[i] = val2;
            p2--;
        } else {
            ans[i] = val1;
            p1++;
        }
    }

    return ans;
};