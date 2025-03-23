
/*
14) Merge overlapping intervals in an array:
Sort all intervals in increasing order of start time.
Traverse sorted intervals starting from the first interval,
If the current interval is not the first interval and it overlaps with the previous interval, then merge it with the previous interval.
Keep doing it while the interval overlaps with the previous one.
Otherwise, add the current interval to the output list of intervals.
Repeat the previous three steps for all the intervals.
*/

import java.io.*;
import java.util.*;
class Interval
{
    int start;
    int end;
    Interval (int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}
class ArrayMergeOverlappingIntervals
{
    static void MergeIntervals (Interval arr [])
    {
        Arrays.sort (arr, new Comparator <Interval> ()
        {
            public int compare (Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });
        int index = 0;
        for (int i = 0; i < arr.length; i ++)
        {
            if (arr [index].end >= arr [i].start)
            {
                arr [index].end = Math.max (arr [index].end, arr [i].end);
            }
            else
            {
                index ++;
                arr [index] = arr [i];
            }
        }
        System.out.println ("Merged Intervals: ");
        for (int i = 0; i <= index; i ++)
        {
            System.out.print ("[" + arr [i].start + "," + arr[i].end + "]");
        }
    }
    public static void main (String [] args)
    {
        Interval arr [] = new Interval [4];
        arr [0] = new Interval (6, 8);
        arr [1] = new Interval (1, 9);
        arr [2] = new Interval (2, 4);
        arr [3] = new Interval (4, 7);
        MergeIntervals (arr);
    }
}

/*
Time Complexity:
O (N * log (N))
Auxiliary Space:
O (1)
*/
