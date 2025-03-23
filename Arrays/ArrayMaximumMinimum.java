
/*
2) Maximum and Minimum elements of an array using Sorting:
Initialize an array.
Sort the array in ascending order.
The first element of the array will be the minimum element.
The last element of the array will be the maximum element.
Print the minimum and maximum element.
*/

import java.io.*;
import java.util.*;
class Pair
{
    int min;
    int max;
}
class ArrayMaximumMinimum
{
    static Pair GetMinMax (int [] arr, int n)
    {
        Pair MinMax = new Pair ();
        Arrays.sort (arr);
        MinMax.min = arr [0];
        MinMax.max = arr [n - 1];
        return MinMax;
    }
    public static void main (String [] args)
    {
        int arr [] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = arr.length;
        Pair MinMax = GetMinMax (arr, arr_size);
        System.out.println ("Minimum Element: " + MinMax.min);
        System.out.println ("Maximum Element: " + MinMax.max);
    }
}

/*
Time complexity:
O (N log N),
where N is the number of elements in the array, as we are using a sorting algorithm.
Auxilary Space:
O (1),
as we are not using any extra space.
*/
