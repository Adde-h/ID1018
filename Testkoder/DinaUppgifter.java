package Testkoder;

import java.io.FileNotFoundException;

class DinaUppgifter {
    public static void main(String[] args) throws FileNotFoundException
    {

        System.out.println("Dina Uppgifter \n");
        
        java.util.Scanner in = new java.util.Scanner (System.in);
        
        System.out.println("Skriv ditt Förnamn samt Efternamn \n");
        String namn = in.nextLine();


        in.close();

        java.io.PrintWriter txt = new java.io.PrintWriter ("BankID.txt");
        txt.println(namn);
        txt.flush();
        txt.close();

        System.out.println("Öppna filen BankID.txt!");

        

    }
}