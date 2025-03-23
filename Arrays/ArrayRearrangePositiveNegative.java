
/*
20) Rearrange array with alternate positive and negative elements:
Maintain a variable to mark if the element is in its correct position or not.
Let the variable be outofplace.
Initially, it is -1.
We will iterate over the array.
If outofplace is -1, we will check if the current index is out of place.
If the current index is out of place we will update the outofplace with the index value.
Else we will keep the value as it is.
If the outofplace is not -1, we will search for the next index which has a different sign than that of the value that is present in outofplace position.
Now we will pass this two positions to right rotate our array.
Update the value of outofplace by 2 unit (because previously valid elements will now become the out-of-place elements).
*/

import java.io.*;
import java.util.*;
class ArrayRearrangePositiveNegative
{
    void RightRotate (int [] arr, int n, int outofplace, int cur)
    {
        int temp = arr[cur];
        for (int i = cur; i > outofplace; i --)
        {
            arr [i] = arr [i - 1];
        }
        arr [outofplace] = temp;
    }
    void Rearrange (int [] arr, int n)
    {
        int outofplace = -1;
        for (int index = 0; index < n; index++)
        {
            if (outofplace >= 0)
            {
                if (((arr [index] >= 0) && (arr [outofplace] < 0)) || ((arr [index] < 0) && (arr [outofplace] >= 0)))
                {
                    RightRotate (arr, n, outofplace, index);
                    if (index - outofplace >= 2)
                    {
                        outofplace = outofplace + 2;
                    }
                    else
                    {
                        outofplace = -1;
                    }
                }
            }
            if (outofplace == -1)
            {
                if (((arr [index] >= 0) && ((index & 0x01) == 0)) || ((arr [index] < 0) && (index & 0x01) == 1))
                {
                    outofplace = index;
                }
            }
        }
    }
    void PrintArray (int [] arr, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print (arr [i] + " ");
        }
        System.out.println (" ");
    }
    public static void main(String[] args)
    {
        ArrayRearrangePositiveNegative rearrange = new ArrayRearrangePositiveNegative();
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int n = arr.length;
        System.out.println("Original array: ");
        rearrange.PrintArray(arr, n);
        rearrange.Rearrange(arr, n);
        System.out.println("Rearranged array: ");
        rearrange.PrintArray(arr, n);
    }
}

/*
Time Complexity:
O (N ^ 2),
as we are using a loop to traverse N times and calling function to right rotate each time which will cost O (N).
Auxiliary Space:
O (1)
*/
