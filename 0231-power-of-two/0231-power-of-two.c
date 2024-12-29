#define TRUE true
#define FALSE false

bool isPowerOfTwo(int n) {
    if (n < 1) {
        return FALSE;
    } else if (n == 1) {
        return TRUE;
    } else {
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            return TRUE;
        }
        return FALSE;
    }
}