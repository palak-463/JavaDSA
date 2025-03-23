
/*
27) Find if an array is a subset of another array using Hashing:
Use a hash set to store elements of arr1 [], this will help in constant time complexity searching.
First insert all elements of arr1 [] into a hash set.
For each element in arr2 [], check if it exists in the hash set.
If any element in arr2 [] is not found in the hash set, return false.
Otherwise, if all elements are found, return true.
*/

import java.io.*;
import java.util.*;
class ArraySubset
{
    public static boolean SubsetHashing (int [] arr1, int [] arr2)
    {
        Set <Integer> hash = new HashSet <> ();
        for (int num : arr1)
        {
            hash.add(num);
        }
        for (int num : arr2)
        {
            if (! hash.contains (num))
            {
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args)
    {
        int [] arr1 = {11, 1, 13, 21, 3, 7};
        int [] arr2 = {11, 3, 7, 1};
        if (SubsetHashing (arr1, arr2))
        {
            System.out.println ("The array is a subset.");
        }
        else
        {
            System.out.println ("The array is not a subset.");
        }
    }
}

/*
Time Complexity:
O (M + N),
where M and N are the sizes of arr1 and arr2 respectively.
Auxiliary Space:
O (M)
*/
