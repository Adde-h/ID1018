package OU5;

public class Polylinje
{

    // En array skapas med typen Punkt. Arrayns referens heter "horn". 
    // Alltså du skapar en polylinje.

    //Konstruktor
    private Punkt[] horn; // Bestämmer hur många punkter polylinjen har
    private String farg = "svart"; // Det här bestämmer färgen på polylinjen
    private int bredd = 1;  // Bestämmer hur bred polylinjen är 

    //Konstruktor
    /* Du skapar en metod som skapar en  polylinje som är TOM UTAN HÖRN. 
       Den har inga punkter. Denna metod ifall du har inga parametrar */
    public Polylinje ()
    {
        this.horn = new Punkt[0];
    }
   
    /*  Konstruktor där polylinjerna sätts in som parameter
        Den loopar igenom alla hörn och sätter dom till en ny punkt
        Horn är ju ett namn, man har en lokalt hörn som är 
        en array av punkter   */ 
    public Polylinje (Punkt[] horn)
    {
        this.horn = new Punkt[horn.length];
        for (int i = 0; i < horn.length; i++)
        this.horn[i] = new Punkt (horn[i]);
    }
    
    // Den loopar igenom alla punkter och kopplar ALLA punkter. 
    // Den skriver ut polylinjen som vi kallar på
    public String toString () 
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < horn.length; i++)
        {
            sb.append(this.horn[i]);
        }
        return "{[" + sb.toString() + "]" + ", " + farg + ", " + bredd + "}"; 
    }

    public Punkt[] getHorn () 
    {
        return this.horn;
    }
    
    public String getFarg () 
    {
        return this.farg;
    }
    
    public int getBredd () 
    {
        return this.bredd;
    }
    
    public void setFarg(String farg) 
    {
        this.farg = farg;
    }
    
    public void setBredd (int bredd) 
    {
        this.bredd = bredd;
    }
    
    // Denna metod räknar längden av Polylinjen. 
    public double langd () 
    {
        double langd = 0;
        for (int i = 0; i < this.horn.length - 1; i++) // this.horn.length elr horn.length
        {
            langd += this.horn[i].avstand(this.horn[i + 1]);
        }
        return langd;
    }
        
    // Denna metod lägger till alla punkter/Hörn i polylinjen
    public void laggTill (Punkt horn)
    {
        Punkt[] h = new Punkt[this.horn.length + 1]; // Skapar en ny array med namn h och längden av den gamla arrayn + 1
        for (int i = 0; i < this.horn.length; i++) // Kopierar över alla punkter från "gamla" h till nya
          h[i] = this.horn[i];
        h[h.length - 1] = new Punkt (horn); //Sätter en deepcopy av valda punkten till sista index
        this.horn = h;
    }
        //Lägger till en punkt framför i Arrayn
        public void laggTillFramfor (Punkt horn, String hornNamn) 
        {
            Punkt[] h = new Punkt[this.horn.length + 1]; //Skapar array med en extra plats
            int pos = 0;
            for(int i = 0; i < this.horn.length; i++) //Går igenom alla punkter för att hitta specifik horn
            {
                if(hornNamn == this.horn[i].getNamn()) //Om detta uppfylls då bryts loopen
                {
                    pos = i; //Pos sätts till den pos där nya horn ska lagras
                    break;
                }
            }
            
            //Kopierar in gamla punkter till den nya arrayn framför val position (pos)
            for(int j = 0; j < pos; j++)
            {
                h[j] = this.horn[j];
            }
            h[pos] = horn; //Sätter in nya hornet till vald position

            for(int j = pos + 1; j < h.length; j++) //forsätter kopiera in resten av punkterna
            {
                h[j] = this.horn[j - 1];
            }

            this.horn = h;
            
        }
        
        public void taBort (String hornNamn) 
        {
            Punkt[] h = new Punkt[this.horn.length - 1]; //Skapar array med en mindre plats
            int pos = 0;
            for(int i = 0; i < this.horn.length; i++) //Går igenom alla punkter för att hitta specifik horn
            {
                if(hornNamn == this.horn[i].getNamn()) //Om detta uppfylls då bryts loopen
                {
                    pos = i; //Pos sätts till den pos där nya horn ska lagras
                    break;
                }
            }

            //Kopierar in gamla punkter till den nya arrayn framför val position (pos)
            for(int j = 0; j < pos; j++)
            {
                h[j] = this.horn[j];
            }

            for(int j = pos + 1; j < h.length; j++) //forsätter kopiera in resten av punkterna
            {
                h[pos] = this.horn[j];
            }

            this.horn = h;

        }

        public class PolylinjeIterator
        { 
            private int aktuell = -1; 
            public PolylinjeIterator () 
            { 
                if (Polylinje.this.horn.length > 0) 
                aktuell = 0; 
            } 
            
            public boolean finnsHorn () 
            { 
                return aktuell != -1; // NOt equal to minus 1
            } 
            
            public Punkt horn () throws java.util.NoSuchElementException
            { 
               if (!this.finnsHorn()) 
                    throw new java.util.NoSuchElementException ("Slut av iterationen"); 
                Punkt horn = Polylinje.this.horn[aktuell]; 
                return horn;    
            }
        
            public void gaFram () 
            { 
                if (aktuell >= 0 && aktuell < Polylinje.this.horn.length - 1) 
                    aktuell++; 
                else 
                    aktuell = -1; 
            }
        }

        
    }

    