class Solution {
    public String largestNumber(int[] nums) {
        String[] newArray = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            newArray[i] = (nums[i] + "");
        }

        Arrays.sort(newArray, (x, y)->(x + y).compareTo(y + x));

        StringBuilder ans = new StringBuilder();

        for(int i = nums.length - 1; i > -1; i--) {
            ans.append(newArray[i]);
        }

        if(ans.charAt(0) == '0') {
            return "0";
        }else {
            return ans.toString();
        }
    }
}