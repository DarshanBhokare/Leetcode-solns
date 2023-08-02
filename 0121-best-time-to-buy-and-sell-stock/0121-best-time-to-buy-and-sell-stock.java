class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int lowestPrice= Integer.MAX_VALUE;
        for(int idx=0;idx<prices.length;idx++){
            if(prices[idx]<lowestPrice){
                lowestPrice=prices[idx];
            }
            else if(prices[idx]-lowestPrice>profit){
                profit=prices[idx]-lowestPrice;
            }
        }
        return profit;
    }
}