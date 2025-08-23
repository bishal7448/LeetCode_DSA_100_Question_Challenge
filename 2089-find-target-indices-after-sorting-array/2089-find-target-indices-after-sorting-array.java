class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallCount = 0;
        int targetCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < target) {
                smallCount++;
            }else if(nums[i] == target) {
                targetCount++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();

        while(targetCount > 0) {
            ans.add(smallCount);
            smallCount++;
            targetCount--;
        }

        return ans;
    }
}