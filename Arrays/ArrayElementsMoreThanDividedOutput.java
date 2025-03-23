
/*
25) Find all elements that appear more than n / k times using Hashing:
First, make a frequency map of all the elements in the array.
Then traverse the map and check the frequency of every element.
If the frequency is greater than n / k then print the element.
*/

import java.io.*;
import java.util.*;
class ArrayElementsMoreThanDividedOutput
{
    public static void MoreThan (int [] arr, int n, int k)
    {
        int x  = n / k;
        HashMap <Integer, Integer> hash = new HashMap <> ();
        for (int i = 0; i < n; i ++)
        {
            if (! hash.containsKey (arr [i]))
            {
                hash.put (arr [i], 1);
            }
            else
            {
                int count = hash.get (arr [i]);
                hash.put (arr [i], count + 1);
            }
        }
        for (Map.Entry m : hash.entrySet ())
        {
            Integer temp = (Integer) m.getValue ();
            if (temp > x)
            {
                System.out.println (m.getKey ());
            }
        }
    }
    public static void main (String [] args)
    {
        int [] arr = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
        int n = 12;
        int k = 4;
        System.out.println ("Elements that appear more than " + n + " / " + k + "times:");
        MoreThan (arr, n, k);
    }
}

/*
Time Complexity:
O (N),
traversing the array of size N.
Auxiliary Space:
O (N),
space occupied by the HashMap.
*/
