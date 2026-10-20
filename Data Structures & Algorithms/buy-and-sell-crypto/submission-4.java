class Solution {
    public int maxProfit(int[] prices) {
      int profit = 0; 
      int l = 0; 
      int r = 0; 
      while (r <= prices.length - 1){
        if (prices[l] > prices[r]){
            l = r; 
        }
      
        profit = Math.max(profit, prices[r] - prices[l]);
        r++;
      }  

      return profit;
    }
}
