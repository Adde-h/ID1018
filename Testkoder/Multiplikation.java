package Testkoder;

class Multiplikation
{

    public static void main (String[] args)
    {
        System.out.println("Detta program används för multiplicering av två tal");

        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Skriv in första talet: ");
        double a = in.nextDouble();

        System.out.println("Skriv in andra talet: ");
        double b = in.nextDouble();
       
        in.close();
       
        double produkt = a * b;
       
        System.out.println("Produkten av " + a + " och " + b + " blir: " + produkt);

    }
}