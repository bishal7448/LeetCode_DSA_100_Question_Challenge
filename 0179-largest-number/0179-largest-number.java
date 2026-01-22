class Solution {
    public String largestNumber(int[] nums) {
        int l = nums.length;

        String[] newNums = new String[l];

        for(int i = 0; i < l; i++) {
            newNums[i] = "" + nums[i];
        }

        Arrays.sort(newNums, (a, b) -> (a + b).compareTo(b + a));

        StringBuilder ans = new StringBuilder();

        for(int i = l - 1; i > -1; i--) {
            ans.append(newNums[i]);
        }

        if(ans.charAt(0) == '0') {
            return "0";
        }else {
            return ans.toString();
        }

        // return ans.toString();
    }
}