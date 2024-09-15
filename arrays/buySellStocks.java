public class buySellStocks {

    public static int buySellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ // profit
                int Profit = prices[i]-buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, Profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit you can get is "+buySellStocks(prices));
    }
}