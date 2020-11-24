package OU2_2;

import java.util.*;

class EnTriangelOchDessCirklar
{
    public static void main (String[] args)
    {

        boolean i = true;

        Scanner in = new Scanner(System.in);
        System.out.println("Mata in de värden du har (annars mata in 0):");
       
        System.out.println("Triangel sida 1: ");
        double a = in.nextDouble();
        System.out.println("Triangel sida 2: ");
        double b = in.nextDouble();
        System.out.println("Triangel sida 3: ");
        double c = in.nextDouble();
        
        System.out.println("Triangel vinkel mellan A och B (Radianer): ");
        double ab = in.nextDouble();

        System.out.println("Triangel vinkel mellan B och C (Radianer): ");
        double bc = in.nextDouble();

        System.out.println("Triangel vinkel mellan A och C (Radianer): ");
        double ac = in.nextDouble();

        while (i == true)
        {
            System.out.println("\n Vad vill du räkna ut?");
            System.out.println( "1: Tre längder av triangeln (Omkrets) \n" + 
                                "2: Två längder och 1 vinkel (Bisektris) \n" + 
                                "3: Herons Formel, tre längder (Area) \n" + 
                                "4: Tre längder (Omskrivna cirkel) \n" +
                                "5: Tre längder (Inskrivna cirkel)" );
            int svar = in.nextInt();

            switch(svar)
            {
                case 1:
                {
                    System.out.println("\nOmkrets:");
                    System.out.println(Triangel.omkrets(a, b, c));
                    break;
                }

                case 2:
                System.out.println("\nBisektris:");
                {  
                    System.out.println("\n Bisektris AB:");
                    System.out.println(Triangel.bisektris_ab(a, b, ab));
                    System.out.println("\n Bisektris BC:");
                    System.out.println(Triangel.bisektris_ab(b, c, bc));
                    System.out.println("\n Bisektris AC:");
                    System.out.println(Triangel.bisektris_ab(a, c, ac));
                    break;
                }

                case 3:
                {
                    System.out.println("\nArea:");
                    System.out.println(Triangel.area(a, b, c));
                    break;
                }

                case 4:
                {
                    System.out.println("\nOmskrivna Cirkelns radie:");
                    System.out.println(Triangel.omskriven(a, b, c));
                    break;
                }

                case 5:
                {
                    System.out.println("\nInskrivna Cirkelns radie:");
                    System.out.println(Triangel.inskriven(a, b, c));
                    break;
                }

            }

            System.out.println("\nForsätta koden? (ja/nej)");
            String nysvar = in.next();

            if (nysvar.equals("nej"))
            {
                System.exit(0);
            }
                   
        }
        
        in.close();

    }


}

