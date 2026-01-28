class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;

        if (n == 0) {
            return true;
        }

        for (int f : flowerbed) {
            boolean emp = (f == 0);
            boolean left_emp = (i == 0 || (flowerbed[i - 1] == 0));
            boolean right_emp = (i == (flowerbed.length - 1) || (flowerbed[i + 1] == 0));

            if (emp && left_emp && right_emp) {
                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }

            i++;
        }

        return false;
    }
}