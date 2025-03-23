
/*
33) Minimum swaps required to bring all elements less than or equal to K together using Fixed Size Sliding Window:
The idea is to find the number of elements which are <= K, (good).
This means that we need a subarray of size ‘good’ with all the elements <= K.
o, for every window of size ‘good’, swap elements in the subarray which are greater than k with elements not included in the subarray and are <= K, to find the minimum swaps.
For this, we can maintain a sliding window of size ‘good’ and for each of the sliding window calculate the minimum swaps by finding the count of elements > K, (bad) in the window.
Minimum swaps among all the sliding windows will be the answer.
*/

class ArrayMinimumSwapsElementsLessThanEqual
{
    static int MinSwap (int [] arr, int n, int k)
    {
        int good = 0;
        for (int i = 0; i < n; i ++)
        {
            if (arr [i] <= k)
            {
                good += 1;
            }
        }
        int bad = 0, minSwaps = good;
        for (int i = 0; i < n; i ++)
        {
            if (arr [i] > k)
            {
                bad += 1;
            }
            if (i == good - 1)
            {
                minSwaps = Math.min (minSwaps, bad);
            }
            else if (i >= good)
            {
                if (arr [i - good] > k)
                {
                    bad -= 1;
                }
                minSwaps = Math.min (minSwaps, bad);
            }
        }
        return minSwaps;
    }
    public static void main (String [] args)
    {
        int [] arr = {2, 7, 9, 8, 5, 7, 4};
        int n = arr.length;
        int k = 5;
        System.out.println ("Minimum Swaps required: " + MinSwap (arr, n, k));
    }
}

/*
Time Complexity:
O (N),
where N is the size of input array arr []
Auxiliary Space:
O (1)
*/
