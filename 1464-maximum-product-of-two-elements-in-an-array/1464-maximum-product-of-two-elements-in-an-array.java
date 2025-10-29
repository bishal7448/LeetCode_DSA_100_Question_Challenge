class Solution {
    public int maxProduct(int[] nums) {
       int len = nums.length;

       int fMax = -1;
       int sMax = -1;

       for(int i = 0; i < len; i++) {
        int digit = nums[i];

        if(fMax < digit) {
            if(sMax < fMax) {
                sMax = fMax;
            }
            fMax = digit;
        }else if(sMax < digit) {
            sMax = digit;
        }
       }

       int ans = (fMax - 1) * (sMax - 1);

       return ans;
    }
}