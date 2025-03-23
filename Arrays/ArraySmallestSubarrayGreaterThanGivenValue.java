
/*
31) Minimum Length Subarray greater than given value using Variable Sized Sliding Window:
Create a window of size 1 with first item as start and end.
Keep adding items towards end of the window while window sum is smaller than x.
If window sum becomes more, then compare the current window length with the result and then remove items while current window sum is more.
*/

class ArraySmallestSubarrayGreaterThanGivenValue
{
    static int SmallestSubWithSum (int [] arr, int n, int x)
    {
        int curr_sum = 0, min_len = n + 1;
        int start = 0, end = 0;
        while (end < n)
        {
            while (curr_sum <= x && end < n)
            {
                curr_sum += arr [end ++];
            }
            while (curr_sum > x && start < n)
            {
                if (end - start < min_len)
                {
                    min_len = end - start;
                }
                curr_sum -= arr [start ++];
            }
        }
        return min_len;
    }
    public static void main (String [] args)
    {
        int [] arr1 = {1, 4, 45, 6, 10, 19};
        int x1 = 51;
        int n1 = arr1.length;
        int res1 = SmallestSubWithSum (arr1, n1, x1);
        System.out.println ("Length of smallest subarray with sum greater than " + x1 + " is " + res1);
        int [] arr2 = {1, 10, 5, 2, 7};
        int x2 = 9;
        int n2 = arr2.length;
        int res2 = SmallestSubWithSum (arr2, n2, x2);
        System.out.println ("Length of smallest subarray with sum greater than " + x2 + " is " + res2);
    }
}

/*
Time Complexity:
O (N),
Every item goes inside the window at most once and goes out of the window at most once.
Adding and removing an item takes O (1) time.
So we overall do at most 2 N work.
Hence, the time complexity is O (N).
Auxiliary Space:
O (1)
*/
