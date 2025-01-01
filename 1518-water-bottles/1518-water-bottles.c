int numWaterBottles(int numBottles, int numExchange) {

    int drinkedBottles = numBottles;

    while (numBottles >= numExchange) {

        int exchangeBottles = numBottles / numExchange;
        drinkedBottles += exchangeBottles;
        int emptyBottles = numBottles % numExchange;

        numBottles = exchangeBottles + emptyBottles;
    }

    return drinkedBottles;
}