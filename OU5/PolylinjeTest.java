package OU5;

class PolylinjeTest
{
    public static void main(String args[])
    {
        Polylinje p = new Polylinje();

        //Testar get & set färg (getFarg, setFarg)
        System.out.println("Färg: " + p.getFarg());
        p.setFarg("Grön");
        System.out.println("Färg: " + p.getFarg());

        //Testar Lägg till och set färg (laggTill, setFarg)
        p.laggTill (new Punkt ("A", 4, 5));
        p.laggTill (new Punkt ("B", 6, 4));
        p.laggTill (new Punkt ("C", 2, 0));
        p.setFarg("Lila");

        //Testar lägg till framför (laggTillFramfor)
        Punkt m = new Punkt ("D", 4, 2);
        p.laggTillFramfor(m,"B");

        //Testar taBort
        p.taBort("C");

        // Testar toString 
        System.out.println(p.toString());

         // Testar getHorn 
         Punkt [] i = p.getHorn(); 
         System.out.println(java.util.Arrays.toString(i));

         // Testar polylinjeiterator 
        Polylinje.PolylinjeIterator c = p.new PolylinjeIterator(); 
       
        System.out.println(c.horn()); 
        c.gaFram(); 
        System.out.println(c.horn()); 
        c.gaFram(); 
        System.out.println(c.horn()); 
        c.gaFram(); 
        
        while(c.finnsHorn()) 
        { 
            System.out.println(c.horn()); c.gaFram(); 
        } 

    }

}