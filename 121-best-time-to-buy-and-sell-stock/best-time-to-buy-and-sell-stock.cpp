class Solution { //shraddha
public: 
    int maxProfit(vector<int>& prices) {
        int maxprofit = 0;
        int bestbuy = prices[0];
        for( int i =1 ; i< prices.size(); i++ ){
             if(prices[i] > bestbuy){
                maxprofit = max(prices[i] - bestbuy,maxprofit);
             }

            bestbuy = min(bestbuy,prices[i]);
        }
        return maxprofit;
    }
};