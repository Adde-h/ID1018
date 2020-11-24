package OU4;

import java.util.*; // Scanner
import static java.lang.System.out;


class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar
{
    public static void main (String[] args)
    {
        out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
        
        // mata in två naturliga heltal
        Scanner in = new Scanner (System.in);
        out.println ("två naturliga heltal:");
        String tal1 = in.next ();
        String tal2 = in.next ();
        out.println ();
        in.close();
       
        // addera heltalen och visa resultatet
        String summa = addera (tal1, tal2);
        visa (tal1, tal2, summa, '+');
       
        // subtrahera heltalen och visa resultatet
        // koden här
        String differens = subtrahera(tal1, tal2);
        visa (tal1, tal2, differens, '-');
    }
    
    // addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras
    // summa som en teckensträng.
    
    public static String addera (String tal1, String tal2)
    {
    // koden ska skrivas här
        StringBuilder resultat = new StringBuilder("");
        int carry = 0;

        int pos1 = tal1.length() - 1;
        int pos2 = tal2.length()-1;

        if (tal1.length() > tal2.length())
        {
            tal2 = nollor(tal2, tal1.length());
        }
        else if (tal1.length() < tal2.length()) 
        {
            tal1 = nollor(tal1, tal2.length());
        }


        for (int i = 1; i <= tal1.length(); i++)
        {
            pos1 = tal1.charAt(tal1.length() - i) - 48;
            pos2 = tal2.charAt(tal2.length() - i) - 48;

            int respos = carry + pos1 + pos2;

            if(respos >= 10)
            {
                resultat.insert(0, respos - 10);
                carry = 1;
            }
            else
            {
                resultat.insert(0, respos);
                carry = 0;
            }
        }

        if (carry >= 1)
        {
            resultat.insert(0,carry);
        }
       
        return resultat.toString();
    }

    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar
    // deras differens som en teckensträng.
    // Det första heltalet är inte mindre än det andra heltalet.
    public static String subtrahera (String tal1, String tal2)
    {
    // koden ska skrivas här
    StringBuilder resultat = new StringBuilder("");
    int carry = 0;

    int pos1 = tal1.length()-1;
    int pos2 = tal2.length()-1;

    if (tal1.length() > tal2.length())
    {
        tal2 = nollor(tal2, tal1.length());
    }
    else if (tal1.length() < tal2.length()) 
    {
        tal1 = nollor(tal1, tal2.length());
    }

    for (int i = 1; i <= tal1.length(); i++)
    {
        pos1 = tal1.charAt(tal1.length() - i) - 48 - carry;
        pos2 = tal2.charAt(tal2.length() - i) - 48;

        int respos = pos1 - pos2;

        if(respos >= 0)
        {
            resultat.insert(0, respos);
            carry = 0;
        }
        else
        {
            resultat.insert(0, (respos + 10));
            carry = 1;

        }
    }
   
    return resultat.toString();
    
    }


    public static String nollor (String talet, int längd)
    {
        StringBuilder nyrad = new StringBuilder(talet);


        while (nyrad.length() < längd)
        {
            nyrad.insert(0, 0);
        }

        return nyrad.toString();

        
    }
    // visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation
    // utförd i samband med hetalen
    public static void visa (String tal1, String tal2, String resultat, char operator)
    {
    // sätt en lämplig längd på heltalen och resultatet
    int len1 = tal1.length ();
    int len2 = tal2.length ();
    int len = resultat.length ();
    int maxLen = Math.max (Math.max (len1, len2), len);
    tal1 = sattLen (tal1, maxLen - len1);
    tal2 = sattLen (tal2, maxLen - len2);
    resultat = sattLen (resultat, maxLen - len);
    // visa heltalen och resultatet
    out.println (" " + tal1);
    out.println ("" + operator + " " + tal2);
    for (int i = 0; i < maxLen + 2; i++)
    out.print ("-");
    out.println ();
    out.println (" " + resultat + "\n");
    }
    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng
    public static String sattLen (String s, int antal)
    {
    StringBuilder sb = new StringBuilder (s);
    for (int i = 0; i < antal; i++)
    sb.insert (0, " ");
    return sb.toString ();
}
}