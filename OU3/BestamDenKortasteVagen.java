package OU3;

class BestamDenKortasteVagen
{
    public static void main (String[] args)
    {

        double [] a = {1,2,3};
        double [][] b = { {4,5,6,7}, {4,5,6,7}, {4,5,6,7} };
        double [] c = {2,3,4,5};

        int[] väg = DenKortasteVagen.mellanstationer(a, b, c);

        System.out.println("\nKortaste Vägen är från Zon 1 till station i Zon 2 med väg: "  
        + väg[0] + 
        "\n\nDärifrån till station i Zon 3 med väg: " 
        + väg[1] + "\n\nMed längden: " 
        + DenKortasteVagen.längd(a, b, c));



    }
}