class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkedBottles = numBottles;

        while(numBottles >= numExchange) {
            int exchangeableBottles = numBottles / numExchange;
            int leftEmptyBottles = numBottles % numExchange;

            drinkedBottles += exchangeableBottles;
            numBottles = exchangeableBottles + leftEmptyBottles;
        }

        return drinkedBottles;
    }
}