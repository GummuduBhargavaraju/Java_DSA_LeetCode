class Solution {
    public int coinChange(int[] coins, int amount) {

        if(amount < 1)
        {
            return 0;
        }

        int []  denominations = new int [amount +1];

        for(int i = 1;i<= amount ; i++)
        {
             denominations[i] = Integer.MAX_VALUE;

             for(int coin : coins)
             {
                if(coin <= i &&  denominations[i -coin] != Integer.MAX_VALUE )
                {
                  denominations[i] = Math.min(denominations[i] ,1+denominations[i-coin]) ; 
                }
             }
        }

        if(denominations[amount] == Integer.MAX_VALUE)
        {
            return -1;
        }

        return denominations[amount]; 
    }
}