package Testkoder;

class Triangle
{
    // triangelns sidlängder
    private double    a;
    private double    b;
    private double    c;

    public Triangle (double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        // perimeter returnerar triangelns omkrets
        public double perimeter ()
        {
            return  a + b + c;
        }

        // area returnerar triangelns area
        public double area ()
        {
            double    s = (a + b + c) / 2;
            double    ar = Math.sqrt (s * (s -a) * (s -b) * (s -c));
            return ar;
        }
}