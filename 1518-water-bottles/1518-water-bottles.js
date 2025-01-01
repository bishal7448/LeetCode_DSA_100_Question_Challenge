/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {
    let drinkedBottles = numBottles;

    while (numBottles >= numExchange) {

        let exchangeBottles = Math.floor(numBottles / numExchange);
        drinkedBottles += exchangeBottles;
        let emptyBottles = numBottles % numExchange;

        numBottles = exchangeBottles + emptyBottles;
    }

    return drinkedBottles;
};