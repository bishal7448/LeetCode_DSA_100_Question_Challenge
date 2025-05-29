class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + "";
        }

        Arrays.sort(arr, (s1 , s2)->(s1 + s2).compareTo(s2 + s1));
 
        StringBuilder ans = new StringBuilder("");

        for(int i = nums.length - 1; i >= 0; i--) {
            ans.append(arr[i]);
        }

        if(ans.charAt(0) == '0') {
            return "0";
        }else {
            return ans.toString();
        }
    }
}