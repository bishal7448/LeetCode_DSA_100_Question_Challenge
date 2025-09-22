class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int ele : nums) {
            hm.put(ele, false);
        }

        for(int key : hm.keySet()) {
            if(hm.containsKey(key - 1) == false) {
                hm.put(key, true);
            }
        }

        int len = 0;

        for(int key : hm.keySet()) {
            int temp = 1;

            if(hm.get(key) == true) {
                while(hm.containsKey(key + temp) == true) {
                    temp++;
                }
            }

            len = Math.max(len, temp);
        }

        return len;
    }
}