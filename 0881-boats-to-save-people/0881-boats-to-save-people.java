class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s = 0;
        int e = people.length - 1;

        int count = 0;

        while(s <= e) {
            int total = people[s] + people[e];

            if(total > limit) {
                count++;
                e--;
            }else {
                count++;
                s++;
                e--;
            }
        }

        return count;
    }
}