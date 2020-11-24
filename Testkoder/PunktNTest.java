package Testkoder;

class PunktNTest
{


    public static void main (String[] args)
    {
        PunktN pm = new PunktN("A",3,4);
        PunktN p2 = new PunktN("B",1,2);
        int i = p2.compareTo(pm); // i kommer bli mindre än noll: p1<pm
        if (i<0)
        {
            System.out.println("P1 är mindre än PM");
        }
        else if (i>0)
        {
            System.out.println("P1 är större än PM");
        }
        else if (i==0)
        {
            System.out.println("P1 är lika med PM");
        }

        System.out.println(pm); //pm.toString(); hämtas automatiskt
        // (3.0,4.0) skrivs ut
    }


}