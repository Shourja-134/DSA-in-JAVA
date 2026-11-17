class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            //vNegative Numbers can nvtr be Integers
            return false;
        }
        int original =x;
        int reverse=0;
        while(x!=0){
          int r=x%10;
          reverse=reverse*10+r;
          x/=10;
        } 
        return original==reverse;
    }
}