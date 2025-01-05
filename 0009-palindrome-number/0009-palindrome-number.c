#define FALSE false /*Macro defination*/
#define TRUE true

bool isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 &&
                  x != 0)) { /*Negetive number never become Palindrome number*/
        return FALSE;
    }

    int realnum = x;
    int revnum = 0;

    while (x > 0) {
        int remnum = x % 10;

        if (revnum > (INT_MAX - remnum) / 10) {
            return false; // Overflow detected
        }

        revnum = revnum * 10 + remnum;
        x /= 10;
    }

    if (realnum == revnum) {
        return TRUE;
    }

    return FALSE;
}