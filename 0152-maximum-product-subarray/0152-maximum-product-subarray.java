class Solution {
    public int maxProduct(int[] arr) {
        int suffix=1;
        int prefix=1;
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(suffix==0)suffix=1;
            if(prefix==0)prefix=1;

            suffix*=arr[i];
            prefix*=arr[n-1-i];
            maxi=Math.max(maxi,Math.max(suffix,prefix));
        }
        return maxi;
    }
}