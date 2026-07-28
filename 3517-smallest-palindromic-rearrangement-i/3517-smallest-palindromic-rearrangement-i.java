class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        char[] c=s.toCharArray();
        int mid=n/2;

        Arrays.sort(c,0,mid);
        for(int i=0;i<n;i++){
            c[n-1-i]=c[i];
        }

        return new String(c);
    }
}