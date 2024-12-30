

int fib(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }

    int firstTerm = 0;
    int secondTerm = 1;

    for (int i = 0; i < n - 1; i++) {
        int temp = secondTerm;
        secondTerm = secondTerm + firstTerm;
        firstTerm = temp;
    }

    return secondTerm;
}