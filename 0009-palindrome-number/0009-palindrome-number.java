class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int realNum = x;
        int revNum = 0;

        while(x > 0){

            int remNum = x % 10;

            revNum = revNum * 10 + remNum;

            x/=10;
        }

        if(revNum == realNum){
            return true;
        }

        return false;
    }
}