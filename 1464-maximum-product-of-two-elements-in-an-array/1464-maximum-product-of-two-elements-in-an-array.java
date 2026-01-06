class Solution {
    public int maxProduct(int[] nums) {
        int fm = -1;
        int sm = -1;

        int n = 0;

        do {
            int val = nums[n];

            if(fm < val) {
                sm = fm;
                fm = val;
            }else {
                if(sm < val) {
                    sm = val;
                }
            }

            n++;
        }while (n < nums.length);

        int ans = (fm - 1) * (sm - 1);

        return ans;
    }
}