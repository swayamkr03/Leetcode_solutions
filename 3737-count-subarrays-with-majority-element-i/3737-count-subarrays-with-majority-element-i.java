class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int output=0;

        for(int i=0;i<n;i++){
            int count=0;
            if(nums[i]==target){
                output++;
                count++;
            }
            
            for(int j=i+1;j<n;j++){
                
                if(nums[j]==target){
                    count++;
                }
                int l=j-i+1;
                if(2*count>l){
                    output++;
                }

            }
        }
        return output;   
    }
}