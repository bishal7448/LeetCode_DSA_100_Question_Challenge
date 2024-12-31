class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drinkBottles = numBottles;

        while (numBottles >= numExchange) {

            int exchangeBottles = numBottles / numExchange;
            int emptyBottles = numBottles % numExchange;

            drinkBottles = drinkBottles + exchangeBottles;

            numBottles = exchangeBottles + emptyBottles;
        }

        return drinkBottles;
    }
}