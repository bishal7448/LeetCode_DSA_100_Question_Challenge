class Solution {
    public int findDuplicate(int[] nums) {

        int ans = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int ele = Math.abs(nums[i]);

            if(nums[ele] > 0) {
                nums[ele] = -nums[ele];
            }else {
                ans = ele;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return ans;
    }
}