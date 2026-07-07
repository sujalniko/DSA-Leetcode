class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        int na = 1;
        while(n>0){
            int temp = n % 10;
            if(temp!=0){
                x = temp*na + x;
                na = na*10;
            }
            sum += temp;
            n /= 10;
        }
        return x*sum;
    }
}