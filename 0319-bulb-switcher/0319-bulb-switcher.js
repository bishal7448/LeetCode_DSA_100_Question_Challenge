/**
 * @param {number} n
 * @return {number}
 */
var bulbSwitch = function (n) {
    let count = 0; //Number of bulbs that are on after n rounds
    let i = 1; //initial number

    while (i * i <= n) {
        count++;
        i++;
    }

    return count;
};