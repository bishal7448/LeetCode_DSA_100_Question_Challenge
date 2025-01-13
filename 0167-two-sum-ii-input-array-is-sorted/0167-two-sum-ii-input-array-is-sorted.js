/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
    let ans = [];
    ans.length = 2;

    p1 = 0; //Left pointer
    p2 = numbers.length - 1; //Right pointer

    while (p1 < p2) {
        let sum = numbers[p1] + numbers[p2];

        ans[0] = p1 + 1;
        ans[1] = p2 + 1;
        
        if (sum === target) {
            break;
        } else if (sum < target) {
            p1++;
        } else {
            p2--;
        }
    }

    return ans;
};