class Solution {
    public long gcdSum(int[] nums) {
        long[] prefixGcd=new long[nums.length];
        long[] mx=new long[nums.length];
        long curr=nums[0];
        mx[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>curr){
                mx[i]=nums[i];
                curr=nums[i];
            }else{
            mx[i]=mx[i-1];
            }
        }

        for(int i=0;i<prefixGcd.length;i++){
            prefixGcd[i]=gcd(mx[i],nums[i]);
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        int left=0;
        int right=prefixGcd.length-1;
        while(left<right){
            long temp=gcd(prefixGcd[left],prefixGcd[right]);
            sum+=temp;
            left++;
            right--;

        }
        return sum;
    }

    public long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}