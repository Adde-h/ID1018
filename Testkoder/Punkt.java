package Testkoder;

public class Punkt
{
    //Instansvariabler
    double x;
    double y;

    //Konstruktor

    //Punkt skapar en punkt utifrån givna koordinater
    public Punkt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Punkt() //Default konstruktor, skapar punkt med kordinater (0,0)
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt (Punkt p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public void setX (double x)
    {
        this.x = x;
    }
    
    public void setY (double y)
    {
        this.y = y;
    }
    
    public String toString()
    {
        String s = "";

        s = "(" + x + "," + y + ")";
        return s;
    }

}