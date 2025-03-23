
/*
12) Merge two sorted arrays using Tree Map:
Insert elements of both arrays in a map as keys.
Print the keys of the map.
*/

import java.io.*;
import java.util.*;
class ArrayMergeSorted
{
    static void MergeArrays ( int [] a, int [] b, int n , int m)
    {
        Map <Integer, Boolean> map = new TreeMap <Integer, Boolean> ();
        for (int i = 0 ; i < n; i ++)
        {
            map.put (a[i], true);
        }
        for (int i = 0; i < m; i ++)
        {
            map.put (b[i], true);
        }
        for (Map.Entry <Integer, Boolean> me : map.entrySet ())
        {
            System.out.print (me.getKey () + " ");
        }
    }
    public static void main (String [] args)
    {
        int [] a = {1, 3, 5, 7};
        int [] b= {2, 4, 6, 8};
        int size1 = a.length;
        int size2 = b.length;
        MergeArrays (a, b, size1, size2);
    }
}

/*
Time Complexity:
O (N log (N) +  M log (M))
Auxiliary Space:
O (N)
*/
