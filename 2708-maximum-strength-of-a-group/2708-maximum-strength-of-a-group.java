class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        long ans=1;
        boolean used=false;
        int n=nums.length;

        for(int x:nums){
            if(x>0){
                ans*=x;
                used=true;
            }
        }

        for(int i=0;i+1<n && nums[i]<0;i+=2){
            if(nums[i+1]<0){
                ans*=nums[i]*nums[i+1];
                used=true;
            }   
        }

        if (used) return ans;

        if(nums[n-1]==0)
            return 0;

        return nums[n-1];

    }
}