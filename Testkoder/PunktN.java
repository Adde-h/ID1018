package Testkoder;

public class PunktN extends Punkt
{
    //Instansvariabler
    private String namn;
    
    //Behövs ej då det hämtas från Punkt.java
    //double x;
    //double y;

    public PunktN(String namn, double x, double y)
    {
        super(x,y); //Första sats i konstruktor
        this.namn = namn;
       // okej men finns bättre
       // this.setX(x);
    }

    public PunktN(String str) //Skriven på form ("A 3 4")
    {
        super(); // Automatiskt läggs till, komplieringsfel om default konstruktorn inte finns i superklass
        String[] ord = str.split("\\s"); //Splittras till "A" "3" "4" med att splittra white spaces
        this.namn = ord[0];
        double a = Double.parseDouble(ord[1]);
        double b = Double.parseDouble(ord[2]);
        this.setX(a);
        this.setY(b);

    }

    public String toString()
    {
        String s = super.toString(); //Gå till direkta superklassen och kör denhär koden
        //Använder toString från Punkt.java och "förbättrar"
        //Strängen s innehåller (3.0,4.0)
        return namn + s; //Returnerar A(3.0,4.0)
    }

    public String getNamn()
    {
        return this.namn;
    }

    public String setNamn(String namn)
    {
        this.namn = namn;
        return namn;
    }

    public int compareTo(PunktN p)
    {
        //Jämför punkterna lexikografiskt, enligt deras namn
        return namn.compareTo(p.namn);
    }
}