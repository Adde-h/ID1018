package Testkoder;
//import java.util.*;

public class Exception
{
    public static void fill (char[] v, int from, int to, char c)
    throws ArrayIndexOutOfBoundsException, IllegalArgumentException
    {

        for (int i = from; i < to; i++)
        {
            v[i] = c;
        }

        
        if (from < 0 || to > v.length)
        {
            throw new ArrayIndexOutOfBoundsException("Index Out Of Range");

           /* ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException("Index Out Of Range");
            throw e; 
            
            ???*/
        }

        if (from > to)
        {
            throw new IllegalArgumentException("Wrong Index Order");

        }


    }

}