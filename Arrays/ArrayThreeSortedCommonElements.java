
/*
19) Find common elements between three sorted array using two pointers and lists:
Initialize an empty reference list (ref) and a final list (final) to store common elements.
Iterate through each element in the first array (ar1).
Check if the current element exists in the second array (ar2).
If found, append it to the reference list (ref).
Iterate through each element in the reference list (ref).
Check if the current element exists in the third array (ar3).
If found, append it to the final list (final).
Print the final list containing the common elements among all three arrays.
*/

import java.io.*;
import java.util.*;
class ArrayThreeSortedCommonElements
{
    static List <Integer> CommonElements (List <Integer> arr1, List <Integer> arr2, List <Integer> arr3)
    {
        List <Integer> ReferenceList = new ArrayList <> ();
        List <Integer> FinalList = new ArrayList <> ();
        for (int num : arr1)
        {
            if (arr2.contains (num))
            {
                ReferenceList.add (num);
            }
        }
        for (int num : ReferenceList)
        {
            if (arr3.contains (num))
            {
                FinalList.add(num);
            }
        }
        return FinalList;
    }
    public static void main (String [] args)
    {
        List <Integer> arr1 = List.of (1, 5, 10, 20, 40, 80);
        List <Integer> arr2 = List.of (6, 7, 20, 80, 100);
        List <Integer> arr3 = List.of (3, 4, 15, 20, 30, 70 ,80, 120);
        List <Integer> FinalList = CommonElements (arr1, arr2, arr3);
        System.out.println ("Common Elements: ");
        for (int num : FinalList)
        {
            System.out.println (num);
        }
    }
}

/*
Time complexity:
O (N),
where N is size of the largest-sized array.
Auxiliary Space:
O (N)
*/
