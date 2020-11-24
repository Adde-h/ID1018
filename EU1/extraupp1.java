package EU1;

class extraupp1
{

    public static void main(String[] args) 
    {
        int[] element = {16,12,3,14,4,2,6,8,33,7,3,7,9,4,5,8};
        
        System.out.println(min(element));
        System.out.println(min2(element));
    }


    // min returnerar det minsta elementet i en sekventiellsamling.
    // Om samlingen är tom, kastas ett undantagav typen IllegalArgumentException.

    public static int min (int[] element)throws IllegalArgumentException
    {
        if (element.length == 0)
        throw new IllegalArgumentException ("tom samling");
        
        // hör ihop med spårutskriften 2:
         //int    antalVarv = 1;

        int[]    sekvens = element;
        int      antaletPar = sekvens.length / 2;
        int      antaletOparadeElement = sekvens.length % 2;
        int      antaletTankbaraElement = antaletPar + antaletOparadeElement;
        int[]    delsekvens = new int[antaletTankbaraElement];
        int      i = 0;
        int      j = 0;
        while (antaletPar > 0) /* Ändras från Sekvens.length till t.ex antaletPar då sekvens.length 
                                    inte ändras, därmed infinite loop */
        {
            // skilj ur en delsekvens med de tänkbara elementen
            i = 0;
            j = 0;
            while (j < antaletPar)
            {
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1])?sekvens[i] : sekvens[i + 1];
                i += 2;
            }
            if (antaletOparadeElement == 1)
            delsekvens[j] = sekvens[i]; //Ändras från 1 till i då (sekvens.length - 1) inte ändras

            // utgå nu ifrån delsekvensen
            sekvens = delsekvens;
            antaletPar = antaletTankbaraElement /2;
            antaletOparadeElement = antaletTankbaraElement % 2;
            antaletTankbaraElement = antaletPar +antaletOparadeElement;
           
            // spårutskrift 1 –för att följasekvensen
             System.out.println (java.util.Arrays.toString (sekvens));

            // spårutskrift 2 -för att avsluta loopen i förväg
            // (för att kunna se vad som händer i början)
            // if (antalVarv++ == 10)
             //   System.exit (0);
        }
        
        // sekvens[0] är det enda återstående tänkbara elementet
        //-det är det minsta elementet
    
        return sekvens[0];


        
    }

    public static int min2 (int[] element)
    {
        int min = 0;
        element[0] = min;
        for (int k = 0; element.length > k; k++)
        {
            if(min > element[k])
            {
                min = element[k];
            }
        }

        return min;
    }
}