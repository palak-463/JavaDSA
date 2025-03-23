
/*
18) Count pairs in an array which make the given sum using HashMap:
Create a map to store the frequency of each number in the array.
Check if (K – arr [i]) is present in the map, if present then increment the count variable by its frequency.
After traversal is over, return the count.
*/

import java.io.*;
import java.util.*;
class ArrayCountPairsGivenSum
{
    static int GetPairs (int [] arr, int n, int k)
    {
        HashMap <Integer, Integer> map = new HashMap <> ();
        int count =0;
        for (int i = 0; i < n; i ++)
        {
            if (map.containsKey (k - arr [i]))
            {
                count += map.get (k - arr [i]);
            }
            if (map.containsKey (arr [i]))
            {
                map.put (arr [i], map.get (arr [i] + 1));
            }
            else
            {
                map.put (arr [i], 1);
            }
        }
        return count;
    }
    public static void main (String [] args)
    {
        int [] arr = {1, 5, 7, -1};
        int n = arr.length;
        int k = 6;
        System.out.println ("Count of pairs: " + GetPairs (arr, n, k));
    }
}

/*
Time Complexity:
O (N),
to iterate over the array.
Auxiliary Space:
O (N),
to make a map of size N.
*/
