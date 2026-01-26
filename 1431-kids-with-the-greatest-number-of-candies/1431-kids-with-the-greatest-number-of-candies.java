class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for(int cand : candies) {
            if(cand > max) {
                max = cand;
            }
        }

        List<Boolean> ans = new ArrayList<>();

        for(int cand : candies) {
            ans.add(max <= (cand + extraCandies));
        }

        return ans;
    }
}