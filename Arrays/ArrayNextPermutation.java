
/*
15) Lexicographically next permutation of a given string:
Traverse from the right and find the first item that is not following the ascending order.
For example in “abedc”, the character ‘b’ does not follow the ascending order.
Swap the found character with the closest greater (or smallest greater) element on the right side of it. In the case of “abedc”, we have ‘c’ as the closest greater element.
After swapping ‘b’ and ‘c’, the string becomes “acedb”.
After swapping, reverse the string after the position of the character found in step a.
After reversing the substring “edb” of “acedb”, we get “acbde” which is the required next permutation.
Since the sequence is sorted in decreasing order, we can use binary search to find the closest greater element.
Since the sequence is already sorted in decreasing order (even after swapping as we swapped with the closest greater), we can get the sequence sorted (in increasing order) after reversing it.
*/

import java.io.*;
import java.util.*;
class ArrayNextPermutation
{
    static char [] Permutation (String s)
    {
        char [] arr = s.toCharArray ();
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr [i] >= arr [i + 1])
        {
            i --;
        }
        if (i < 0)
        {
            String st = "No next permutation possible.";
            char [] ar = st.toCharArray ();
            return ar;
        }
        int j = n - 1;
        while (j >= 0 && arr [j] <= arr [i])
        {
            j --;
        }
        swap (arr, i, j);
        rev (arr, i + 1, n - 1);
        return arr;
    }
    static void swap(char [] arr, int i, int j)
    {
        char temp = arr [i];
        arr [i] = arr [j];
        arr [j] = temp;
    }
    static void rev (char [] arr, int start, int end)
    {
        while (start < end)
        {
            swap (arr, start, end);
            start ++;
            end --;
        }
    }
    public static void main (String [] args)
    {
        String str = "abc";
        System.out.println (Permutation (str));
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
