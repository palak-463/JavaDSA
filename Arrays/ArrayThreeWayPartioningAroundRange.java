
/*
32) Three way partioning around a range using two pointers:
Create two variables start and end to store the index of the vacant place to store the elements according to their range.
Traverse the array from 0 to end.
If an element is less than low then swap it with the element present at index start and increase the value of start by 1.
If an element is greater than high then swap it with the element present at index end and decrease the value of end by 1.
Print the array.
 */

class ArrayThreeWayPartioningAroundRange
{
    public static void ThreeWay (int [] arr, int low, int high)
    {
        int n = arr.length;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end;)
        {
            if (arr [i] < low)
            {
                int temp = arr [start];
                arr [start] = arr [i];
                arr [i] = temp;
                start ++;
                i ++;
            }
            else if (arr [i] > high)
            {
                int temp = arr [end];
                arr [end] = arr [i];
                arr [i] = temp;
                end --;
            }
            else i ++;
        }
    }
    public static void main (String [] args)
    {
        int [] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        ThreeWay (arr, 5, 20);
        System.out.println ("Modified array: ");
        for (int i = 0; i < arr.length; i ++)
        {
            System.out.print (arr [i] + " ");
        }
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
