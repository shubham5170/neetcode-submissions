class Solution {
    public int coinChange(int[] coins, int amount) {
        int ret = coinChange(coins,amount, coins.length-1);
        return ret>amount?-1:ret;   
    }

    public int coinChange(int[] coins, int amount, int index)
    {
        if(amount==0) return 0;
        if(index==-1) return Integer.MAX_VALUE-amount;

        if(coins[index]<=amount)
        {
            return Math.min(1+ coinChange(coins,amount-coins[index],index),coinChange(coins,amount,index-1));
        }
        else
        {
            return coinChange(coins,amount,index-1);
        }

    }
}
