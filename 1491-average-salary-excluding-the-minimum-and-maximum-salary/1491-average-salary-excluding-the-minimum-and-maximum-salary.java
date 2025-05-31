class Solution {
    public double average(int[] salary) {
        int minSal = salary[0];
        int maxSal = salary[0];
        int sum = salary[0];

        for(int i = 1; i < salary.length; i++) {
            if(minSal > salary[i]) {
                minSal = salary[i];
                sum += salary[i];
            }else if(maxSal < salary[i]) {
                maxSal = salary[i];
                sum += salary[i];
            }else {
                sum += salary[i];
            }
        }

        sum = sum - minSal - maxSal;

        double ans = (double) sum/(salary.length - 2);

        return ans;
    }
}