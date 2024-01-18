package Array;

//TIME COMPLEXITY : O(n)
//Time to buy and sell stock : buy at min and sell at maximum profit
public class BuySellStock {

    public static int BuyandSellStock(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        //loop
        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){//profit
                int profit=price[i]-buyPrice;//today's profit
                maxProfit=Math.max(maxProfit,profit);
            }else {
                buyPrice=price[i];
            }
        }
        return maxProfit;
    } 
    public static void main(String[] args) {
        int price[]={7, 1, 5, 3, 6, 4};

        System.out.print("Maximum profit = ");
        System.out.println(BuyandSellStock(price));//profit=SL-BP=6-1=5
    }
}
