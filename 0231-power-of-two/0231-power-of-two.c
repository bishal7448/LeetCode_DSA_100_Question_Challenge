#define TRUE true
#define FALSE false

bool isPowerOfTwo(int n) {
    if (n < 0 || n == 0) { // We can also use n < 1 this condition.
        return FALSE;
    } else if (n == 1) {
        return TRUE;
    } else {
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return TRUE;
        }
    }

    return FALSE;
}