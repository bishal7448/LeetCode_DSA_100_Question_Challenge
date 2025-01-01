int tribonacci(int n) {
    if (n == 0) {

        return 0;
    } else if (n == 1) {

        return 1;
    } else if (n == 2) {

        return 1;
    } else {

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 1;

        for (int i = 1; i < n - 1; i++) {
            int fourthTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm;
        }
    
        return thirdTerm;
    }
}