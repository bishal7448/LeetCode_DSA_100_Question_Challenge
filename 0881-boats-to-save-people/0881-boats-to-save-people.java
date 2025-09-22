class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int s = 0;
        int e = people.length - 1;

        int boat = 0;

        while(s <= e) {
            if(people[s] + people[e] > limit) {
                boat++;
                e--;
            }else {
                boat++;
                s++;
                e--;
            }
        }

        return boat;
    }
}