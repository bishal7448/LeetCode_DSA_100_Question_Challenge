#define TRUE true
#define FALSE false

bool isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return FALSE;
    }

    int realnum = x;
    int revnum = 0;

    while (x > 0) {

        int remnum = x % 10;

        if (revnum > (INT_MAX - remnum) / 10) {
            return FALSE;
        }

        revnum = revnum * 10 + remnum;
        x /= 10;
    }

    if (revnum == realnum) {
        return TRUE;
    }

    return FALSE;
}