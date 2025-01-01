class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int pointer = num.length - 1;

        int carry = 0;

        while (pointer >= 0 || k > 0) {
            int lastArrVal = 0;

            if (pointer >= 0) {
                lastArrVal = num[pointer];
            }

            int lastKDigit = k % 10; // It is last digit from k

            int total = lastArrVal + lastKDigit + carry;

            int sum = total % 10;

            ans.add(sum);

            carry = total / 10;

            pointer--; // Move the pointer to left

            k /= 10; // Remove last digit from the k
        }

        if (carry > 0) {
            ans.add(carry); // Add extra carry to the array list
        }

        Collections.reverse(ans); // Reverse the answer array list

        return ans;
    }
}