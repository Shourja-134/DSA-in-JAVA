class Solution {
    public int reverse(int x) {
        int sum=0;
        while(x!=0){
           int r=x%10;
           // Constraint er jonne checking 
           if(sum>0 && sum>(Integer.MAX_VALUE-r)/10) return 0;
           if(sum<0 && sum<(Integer.MIN_VALUE-r)/10) return 0; 
           sum=sum*10+r;
           x/=10;
        }
    return sum;
    }
}