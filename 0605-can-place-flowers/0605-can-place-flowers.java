class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) {
            return true;
        }

        for(int i = 0; i < flowerbed.length; i++) {
            boolean emp = (flowerbed[i] == 0);
            boolean lefEmp = (i == 0 || flowerbed[i - 1] == 0);
            boolean rigEmp = (i == (flowerbed.length - 1) || flowerbed[i + 1] == 0);

            if(emp && lefEmp && rigEmp) {
                flowerbed[i] = 1;
                n--;

                if(n == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}