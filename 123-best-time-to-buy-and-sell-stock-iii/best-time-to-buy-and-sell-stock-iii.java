class Solution {
    public int maxProfit(int[] prices) {

        if( prices == null ||  prices.length <2)
        {
            return 0;
        }

        int [] leftprofit = new int [prices.length];
        int [] rightprofit = new int [prices.length];

        int minprice = Integer.MAX_VALUE;
        int maxprofit  = Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            minprice = Math.min( minprice,prices[i] );
             maxprofit  = Math.max(maxprofit, prices[i] - minprice);
             leftprofit[i] = maxprofit;
        }
         int maxprice = Integer.MIN_VALUE;
             maxprofit  = Integer.MIN_VALUE;

        for(int i = prices.length-1;i>=0;i--)
        {
            maxprice = Math.max( maxprice,prices[i] );
             maxprofit  = Math.max(maxprofit, maxprice - prices[i]);
             rightprofit[i] = maxprofit; 

        }

        int max = 0;
        for(int i =0;i<prices.length;i++)
        {
            max = Math.max(max ,leftprofit[i] +  rightprofit[i]);
        }
        return max;
    }
}