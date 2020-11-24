package Mat;

import java.util.*;

class matTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double r = in.nextInt();
        double d = r*r*mat.PI;

        int a = in.nextInt();
        int b = in.nextInt();
        int m = mat.max(a,b);

        in.close();

        System.out.println(d);
        System.out.println(m);
    }
    
}