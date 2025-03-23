
/*
26) Maximum Profit after buying and selling a stock with two permitted transactions using Dynamic Programming:
Initialize two 2D arrays, current and next, to store profit states.
Iterate backwards through the prices array.
For each price, calculate two possible states.
Buy state - Max of buying at current price and the previous sell state.
Sell state - Max of selling at current price and the previous buy state.
Move current state to next for the next iteration.
Return the final buy state with two transactions (current [2] [1]) as the maximum profit.
*/

import java.io.*;
import java.util.*;
class ArrayBuySellStockTwoTransactions
{
    public static int MaxProfit (int [] prices)
    {
        int n = prices.length;
        if (n == 0)
        {
            return 0;
        }
        int [] [] current = new int [3] [2];
        int [] [] next = new int [3] [2];
        for (int i = n - 1; i >= 0; i --)
        {
            for (int k = 1; k <= 2; k ++)
            {
                current [k] [1] = Math.max (-prices [i] + next [k] [0], next [k] [1]);
                current [k] [0] = Math.max (prices [i] + next [k - 1] [1], next [k] [0]);
            }
            next = Arrays.copyOf (current, current.length);
        }
        return current [2] [1];
    }
    public static void main (String [] args)
    {
        int [] prices = {10, 22, 5, 75, 65, 80};
        System.out.println ("The maximum profit is: " + MaxProfit (prices));
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
