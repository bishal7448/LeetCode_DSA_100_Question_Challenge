class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int p = 0;

        int n = nums.length;

        while(p < n) {
            if(nums[p] != val) {
                nums[l++] = nums[p++];
            } else {
                p++;
            }
        }

        return l;
    }
}