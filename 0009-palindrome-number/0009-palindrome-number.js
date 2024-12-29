/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    if (x < 0 || (x % 10 === 0 && x !== 0)) {
        return false;
    }

    let realnum = x;
    let revnum = 0;

    while (x > 0) {
        let remnum = x % 10;
        revnum = revnum * 10 + remnum;
        x = Math.floor(x / 10);
    }

    if (revnum === realnum) {
        return true;
    }

    return false;
};