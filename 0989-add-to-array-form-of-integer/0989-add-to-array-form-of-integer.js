/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function (num, k) {
    let ans = [];

    let pointer = num.length - 1;

    let carry = 0;

    while (pointer >= 0 || k > 0) {
        let arrLastVal = 0;

        if (pointer >= 0) {
            arrLastVal = num[pointer];
        }

        let lastKDigit = k % 10;

        let total = arrLastVal + lastKDigit + carry;

        let sum = total % 10;

        ans.push(sum);

        carry = Math.trunc(total / 10);

        pointer--;

        k = Math.floor(k / 10);
    }

    if (carry > 0) {
        ans.push(carry);
    }

    ans = ans.reverse();

    return ans;
};