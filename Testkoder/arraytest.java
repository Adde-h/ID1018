package Testkoder;

import java.util.*;

class arraytest{


    public static void main (String[] args)
    {

        System.out.println("Hur många värden vill du mata in?");
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();
        int [] a = new int[b];
       System.out.println("Skriv in " + b + " tal");

        
        
        for (int i=0; i<a.length; i++ )
        {
            a[i] = in.nextInt();
        }
        
        

        System.out.println("De " + b + " sparade värdena är");

        for (int j=0; j<a.length; j++)
        {
            System.out.println(a[j]);

        }

        in.close();

    }
}