/*
24) Longest consecutive subsequence using Hashing:
Create an empty hash.
Insert all array elements to hash.
Do the following for every element arr [i].
Check if this element is the starting point of a subsequence.
To check this, simply look for arr [i] – 1 in the hash, if not found, then this is the first element of a subsequence.
If this element is the first element, then count the number of elements in the consecutive starting with this element.
Iterate from arr [i] + 1 till the last element that can be found.
If this element is the first element, then count the number of elements in the consecutive starting with this element. Iterate from arr[i] + 1 till the last element that can be found.
If the count is more than the previous longest subsequence found, then update this.
*/

import java.util.*;
class ArrayLargestConsecutiveSubsequence
{
    static int LongestSubsequence (int [] arr, int n)
    {
        HashSet <Integer> hash = new HashSet <Integer> ();
        int ans = 0;
        for (int i = 0; i < n; ++ i)
        {
            hash.add (arr [i]);
        }
        for (int i = 0; i < n; ++ i)
        {
            if (! hash.contains (arr [i] - 1))
            {
                int j = arr [i];
                while (hash.contains (j))
                {
                    j ++;
                }
                if (ans < j - arr [i])
                {
                    ans = j - arr [i];
                }
            }
        }
        return ans;
    }
    public static void main(String [] args)
    {
        int [] arr = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println ("Length of the Longest consecutive subsequence is " + LongestSubsequence (arr, n) + ".");
    }
}

/*
Time complexity:
O (N),
only one traversal is needed and the time complexity is O (N) under the assumption that hash insert and search takes O(1) time.
Auxiliary space:
O (N),
to store every element in the hashmap O (N) space is needed.
*/