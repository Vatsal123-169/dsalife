class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int buy,sell=0;
        int best=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<prices[buy])buy=i;
            if(prices[i]-prices[buy]>best)
            {
                sell=i;
                best=arr[i]-arr[buy];
            }
        }
        return best;
    }
}