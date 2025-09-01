class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        if(digits[n - 1] != 9) {
            digits[n - 1] = digits[n - 1] + 1;
            return digits;
        }else {
            digits[n - 1] = 0;
        }

        for(int i = n - 2; i > -1; i--) {
            if(digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int[] newAns = new int[n + 1];
        newAns[0] = 1;

        return newAns;
    }
}