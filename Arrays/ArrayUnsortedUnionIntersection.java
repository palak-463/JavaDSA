
/*
6) Find Union and Intersection of two unsorted arrays using a Set:
Union of two arrays we can get with the Set data structure very easily.
A set is a data structure that allows only the distinct elements in it.
So, when we put the elements of both the array into the set we will get only the distinct elements that are equal to the union operation over the arrays.
*/

import java.io.*;
import java.util.*;
class ArrayUnsortedUnionIntersection
{
    static void GetUnion (int [] a, int n, int [] b, int m)
    {
       HashSet <Integer> s = new HashSet <> ();
       for (int i = 0; i < n; i ++)
       {
           s.add (a [i]);
       }
       for (int i = 0; i < m; i ++)
       {
           s.add (b [i]);
       }
       System.out.println ("Number of elements after union operation: " + s.size ());
       System.out.println ( "The union set of both arrays is: " + s.toString () + " ");
    }
    public static void main (String [] args)
    {
        int [] a = {1, 2, 5, 6, 8, 9, 3};
        int [] b = {3, 8, 6, 7, 4};
        GetUnion (a, 6, b, 4);
    }
}

/*
Time Complexity:
O (M * log (M) + N * log (N))
Auxiliary Space:
O (M + N)
*/
