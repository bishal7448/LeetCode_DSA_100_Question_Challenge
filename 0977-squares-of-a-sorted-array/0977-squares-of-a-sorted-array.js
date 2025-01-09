/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
    let ans = [];
    ans.length = nums.length;

    let p1 = 0;
    let p2 = nums.length - 1;
    let p3 = ans.length - 1;

    while (p3 > -1) {
        let val1 = nums[p1] * nums[p1];
        let val2 = nums[p2] * nums[p2];

        if (val1 > val2) {
            ans[p3] = val1;
            p1++;
        } else {
            ans[p3] = val2;
            p2--;
        }

        p3--;
    }

    return ans;
};