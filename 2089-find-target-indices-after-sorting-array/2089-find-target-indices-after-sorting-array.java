class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallNum = 0;
        int countTarget = 0;

        for(int ele : nums) {
            if(ele == target) {
                countTarget++;
            }else if(ele < target) {
                smallNum++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(countTarget > 0) {
            ans.add(smallNum);
            smallNum++;
            countTarget--;
        }

        return ans;
    }
}