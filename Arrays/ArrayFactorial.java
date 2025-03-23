
/*
22) Find the factorial of a large number using BigInteger:
Declare a BigInteger f with 1 and perform the conventional way of calculating factorial.
Traverse a loop from x = 2 to N and multiply x with f and store the resultant value in f.
*/

import java.io.*;
import java.util.*;
import java.math.*;
class ArrayFactorial
{
    static BigInteger Factorial (int n)
    {
        BigInteger BigInteger= new BigInteger ("1");
        for (int i = 2; i <= n; i ++)
        {
            BigInteger = BigInteger.multiply (BigInteger.valueOf (i));
        }
        return BigInteger;
    }
    public static void main (String [] args) throws Exception
    {
        int n = 100;
        System.out.println ("The factorial of " + n + " is " + Factorial (n) + ".");
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
