class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int distinct=1;
        int prev=nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=prev){
                distinct++;
                prev=nums[i];

                if(distinct==3)
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}