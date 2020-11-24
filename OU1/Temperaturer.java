package OU1;

import java.util.*;

class Temperaturer
{
    public static void main (String[] args)
    {

        System.out.println ("Temperaturer\n");

        //Inmatningsverktyg
        Scanner in = new Scanner (System.in);
        in.useLocale(Locale.US);

        //mata in uppgifter om antalet veckor och antalet mätningar
        System.out.print("antalet veckor:");
        int antalVeckor = in.nextInt();
        System.out.print("antalet mätningar per vecka:");
        int antalMatningarPerVecka = in.nextInt();

        //plats att lagra temperaturer
        double [] [] t = new double[antalVeckor + 1] [antalMatningarPerVecka + 1];

        //mata in temperaturerna
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {

            System.out.println("\n" + "temperaturer - vecka " + vecka + ":");
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
            
                t[vecka][matning] = in.nextDouble();

            
        }
        

        System.out.println();

        //visa temperaturerna
        System.out.println("temperaturerna:");
        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
            for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
            System.out.println(t[vecka] [matning] + " ");
            System.out.println();
        }
        System.out.println();

        //den minsta, den största och medeltemperaturen - veckovis
        double[] minT = new double[antalVeckor + 1];
        double[] maxT = new double[antalVeckor + 1];
        double[] sumT = new double[antalVeckor + 1];
        double[] medelT = new double[antalVeckor + 1];
    
    //koden ska skrivas här
    for(int vecka = 1; vecka<t.length; vecka++)
    {
        minT[vecka] = t[vecka][1];
        maxT[vecka] = t[vecka][1];
        sumT[vecka] = t[vecka][1];

        for(int mätning = 2; mätning < t[vecka].length; mätning++)
        {
            if(t[vecka][mätning] > maxT[vecka])
            {
                maxT[vecka] = t[vecka][mätning];
            }
            else if(t[vecka][mätning] < minT[vecka])
            {
                minT[vecka] = t[vecka][mätning];
            }
            sumT[vecka] += t[vecka][mätning];
        }

        medelT[vecka] = sumT[vecka] / (t[vecka].length - 1);

    }

    //visa den minsta, den största och medeltemperaturen för varje vecka
    //koden ska skrivas här

    for(int vecka = 1; vecka < t.length; vecka++)
    {
        
        
        System.out.println("Den största - minsta - medel temperaturen för vecka: " + vecka + ":");
        System.out.println("\t" + maxT[vecka] + "\t" +  minT[vecka] + "\t" + medelT[vecka] + "\n");

        
    }


    //Den minsta den största och medeltemperaturen - hela mätperioden
    
    double minTemp = minT[1];
    double maxTemp = maxT[1];
    double sumTemp = sumT[1];
    double medelTemp = 0;

    //koden ska skrivas här

    for (int vecka = 2; vecka < minT.length; vecka++)
    {
        if(minT[vecka] < minTemp)
        {
            minTemp = minT[vecka];
        }
        else if(maxT[vecka] > maxTemp)
        {
            maxTemp = maxT[vecka];
        }
        else
        {

        }
        sumTemp += sumT[vecka];
       
    }

        medelTemp = sumTemp / (antalVeckor * antalMatningarPerVecka);

        //visa den minsta, den största och medeltemperaturen i hela mätperioden
        //koden ska skrivas här
    
    
        System.out.println("Den största - minsta - medel temperaturen för hela mätperioden:");
        System.out.println("\t" + maxTemp + "\t" + minTemp + "\t" + medelTemp);
    
        in.close();
    }

}