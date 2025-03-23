
/*
11) Find duplicates in an array using HashMap:
Create an empty unordered map (hashmap) to store the frequency of each element in the array.
Iterate through the given array.
For each element in the array, increment its frequency count in the hashmap.
Iterate through the hashmap.
For each key-value pair in the hashmap, if the value (frequency count) is greater than 1, add the corresponding key (element) to the result vector.
If the result vector is empty after step 3, it means no duplicates were found. In this case, add -1 to the result vector.
Return the result vector containing duplicate elements or -1 if no duplicates were found.
*/

import java.io.*;
import java.util.*;
public class ArrayDuplicates
{
    public static List <Integer> Duplicates (long [] arr)
    {
        Map <Long, Integer> Frequency = new HashMap <> ();
        List <Integer> Result = new ArrayList <> ();
        for (long num : arr)
        {
            Frequency.put (num, Frequency.getOrDefault (num, 0) + 1);
        }
        for (Map.Entry <Long, Integer> entry : Frequency.entrySet ())
        {
            if (entry.getValue () > 1)
            {
                Result.add (Math.toIntExact (entry.getKey()));
            }
        }
        if (Result.isEmpty())
        {
            Result.add(-1);
        }
        Collections.sort(Result);
        return Result;
    }
    public static void main (String [] args)
    {
        long [] a = {1, 6, 5, 2, 3, 3, 2};
        List <Integer> DuplicatesFound = Duplicates(a);
        System.out.println ("Duplicate elements: ");
        for (int element : DuplicatesFound)
        {
            System.out.println (element);
        }
    }
}

/*
Time Complexity:
O (N),
only two traversals are needed.
Auxiliary Space:
O (N),
the extra space is used for the array to be returned .
*/
