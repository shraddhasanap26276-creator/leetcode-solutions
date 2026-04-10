class Solution {
public int maxProfit(int[] prices) {
   
     int buyP = prices[0];
     int profit = 0;

    for(int i = 1; i< prices.length; i++){
        if(buyP > prices[i]){
            buyP = prices[i];
        }
        else{
            int currp = prices[i] - buyP;
            profit = Math.max(profit,currp); 
        }
    }

    return profit;
    }
}