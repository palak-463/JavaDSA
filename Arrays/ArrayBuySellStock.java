
/*
17) Best time to buy and sell a stock with only one permitted transaction using Greedy Approach:
Declare a buy variable to store the min stock price encountered so far and max_profit to store the maximum profit.
Initialize the buy variable to the first element of the prices array.
Iterate over the prices array and check if the current price is less than buy price or not.
If the current price is smaller than buy price, then buy on this ith day.
If the current price is greater than buy price, then make profit from it and maximize the max_profit.
Finally, return the max_profit.
*/

import java.io.*;
import java.util.*;
class ArrayBuySellStock
{
    static int MaxProfit (int [] prices, int n)
    {
        int buy = prices [0], max_profit = 0;
        for (int i = 1; i < n; i ++)
        {
            if (buy > prices[i])
            {
                buy = prices [i];
            }
            else if (prices [i] - buy > max_profit)
            {
                max_profit = prices [i] - buy;
            }
        }
        return max_profit;
    }
    public static void main (String [] args)
    {
        int [] prices = {7, 1, 5, 6, 4};
        int n = prices.length;
        int max_profit = MaxProfit (prices, n);
        System.out.println ("The maximum profit would be: " + max_profit);
    }
}

/*
Time Complexity:
O (N),
where N is the size of prices array.
Auxiliary Space:
O (1)
*/
