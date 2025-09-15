public class StockBuyAndSell {
    int maxProfit(int[] arr){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                res+=arr[i]-arr[i-1];
            }
        }
        return res;
    }
    public static void main(String args[]){
        StockBuyAndSell obj=new StockBuyAndSell();
        int[] prices={100,180,260,310,40,535,695};
        int result=obj.maxProfit(prices);
        System.out.println(result);
        
    }
}
