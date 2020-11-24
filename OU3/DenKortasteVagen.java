package OU3;

class DenKortasteVagen
{
    
    // mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste'
    // vägen. Ordningsnummer av den första mellanstationen finns på index 1, och ordningsnummer
    // av den andra mellanstationen på index 2 i vektorn.
    public static int[] mellanstationer (double[] a, double[][] b,double[] c)
    {
        // koden här
        
        double kortast = a[0] + b[0][0] + c[0];
        int[] index = new int[2];
        

            for(int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < c.length; j++ )
               {
                    if(a[i] + b[i][j] + c[i] < kortast)
                   {
                        kortast = a[i] + b[i][j] + c[i];
                        index[0] = i;
                        index[1] = j;

                                            
                   }
               } 
            }
           
            return index;    
    }
        
        // langd returnerar längden av den kortaste vägen.
        
        public static double längd (double[] a, double[][] b, double[] c)
        {
            // koden här
            double kortast = a[0] + b[0][0] + c[0];
            for(int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < c.length; j++ )
               {
                    if(a[i] + b[i][j] + c[i] < kortast)
                   {
                        kortast = a[i] + b[i][j] + c[i];
                   }
               } 
            }
            return kortast;
         
        }
}