class Solution {
    public String largestNumber(int[] nums) {
        String[] newArr = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i] + "";
        }

        Arrays.sort(newArr, (s1, s2)->(s1 + s2).compareTo(s2+s1));

        StringBuilder ans = new StringBuilder("");
        
        for(int i = nums.length - 1; i > -1; i--) {
            ans.append(newArr[i]);
        }

        if(ans.charAt(0) == '0') {
            return "0";
        }else {
            return ans.toString();
        }
    }
}