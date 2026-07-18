    class Solution {
        public int mirrorDistance(int n) {
            int m=0;
            int k=n;
            while(n!=0){
            int rev=n%10;
            m=m*10+rev;
            n=n/10;
            }
        

        return Math.abs(k-m);
    }
    }