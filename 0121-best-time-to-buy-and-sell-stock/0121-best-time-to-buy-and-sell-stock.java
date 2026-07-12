class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-minPrice;
            minPrice=Math.min(minPrice,prices[i]);
            max=Math.max(max,profit);
        }
        return max;

    }
}