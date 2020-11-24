package OU5;

public class Punkt
{
    //Instansvariabler
    String namn;
    int x;
    int y;

    //Konstruktor som konstruerar punkter
    public Punkt(String namn, int x, int y)
    {
        this.namn = namn;
        this.x = x;
        this.y = y;
    }

    //Konstruktor som kopierar punkter: Punkt p = new Punkt (p1)
    public Punkt(Punkt p) {
        namn = p.namn;
        x = p.x;
        y = p.y;
    }

    //Returnera namnet av objektet
    public String getNamn()
    {
        return namn;
    }

    //Returnera X-koordinaten av objektet
    public int getX()
    {
        return x;
    }

    //Returnera Y-koordinaten av objektet
    public int getY()
    {
        return y;
    }

    //Sätter X-koordinaten av objektet
    public void setX(int x)
    {
        this.x = x;
    }

    //Sätter Y-koordinaten av objektet
    public void setY(int y)
    {
        this.y = y;
    }

    //Returnerar avståndet mellan två punkter: p1.avstand(p2)
    public double avstand(Punkt p)
    {
        return Math.sqrt ( (this.x - p.x) * (this.x - p.x) +
                           (this.y - p.y) * (this.y - p.y) );
    }

    //Returnerar ifall punkterna är lika, dvs ifall namn,x,y är lika: p1.equals(p2)
    public boolean equals(Punkt p)
    {
        if (this.namn.equals(p.namn) && this.x == p.x && this.y == p.y)
        {
            return true;
        }
        else
            return false;
    }

    // Skriver ut punkten mer läsligt
    public String toString() {
        return "(" + this.namn + " " + this.x + " " + this.y + ")";
    }
}