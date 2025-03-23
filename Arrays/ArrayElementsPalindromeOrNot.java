
/*
34) Check if all elements of the array are palindrome or not:
The basic idea is to check each number in the array is a palindrome by converting each number to a string and comparing its characters symmetrically from both ends.
If any non-palindrome is found then returns false otherwise true.
*/

class ArrayElementsPalindromeOrNot
{
    static boolean isPalindrome (int n)
    {
        String s = Integer.toString (n);
        int len = s.length ();
        for (int i = 0; i < len / 2; i ++)
        {
            if (s.charAt(i) != s.charAt (len -1 -i))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalinArray (int [] arr)
    {
        for (int i = 0; i < arr.length; i ++)
        {
            if (!isPalindrome (arr [i]))
            {
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args)
    {
        int [] arr = {121, 131, 20};
        boolean res = isPalinArray (arr);
        System.out.println (res);
    }
}

/*
Time Complexity:
O (N*K),
N is for traversing the array and K is for checking each element.
Auxiliary Space:
O (1)
 */
