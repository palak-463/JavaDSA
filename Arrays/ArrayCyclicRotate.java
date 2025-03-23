
/*
7) Cyclically Rotate an array by one using two pointers:
Take two pointers i and j which point to first and last element of array respectively.
Start swapping arr [i] and arr [j] and keep j fixed and i moving towards j.
Repeat the above steps till i is not equal to j.
*/

import java.io.*;
import java.util.*;
class ArrayCyclicRotate
{
    static int [] arr = new int [] {1, 2, 3, 4, 5};
    static void Rotate ()
    {
        int i = 0, j = arr.length - 1;
        while (i != j)
        {
            int temp = arr [i];
            arr [i] = arr [j];
            arr [j] = temp;
            i ++;
        }
    }
    public static void main (String [] args)
    {
        Rotate ();
        System.out.println ("Cyclically Rotated Array: " + Arrays.toString (arr));
    }
}

/*
Time Complexity:
O (N),
as we need to iterate through all the elements.
Where N is the number of elements in the array.
Auxiliary Space:
O (1),
as we are using constant space.
*/
