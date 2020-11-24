package OU2_2;

class Triangel
{
    public static double area(double a, double b, double c)
    {
        double omkretsen = a + b + c;
        double s = omkretsen / 2;
        return (Math.sqrt(s*((s-a)*(s-b)*(s-c))));
    }

    public static double omkrets(double a, double b, double c)
    {
        return (a+b+c);
    }

    public static double bisektris_ab(double a, double b, double ab)
    {
        double    p = 2 * a * b * Math.cos (ab / 2);
        double    bis = p / (a + b);
        return bis;
    }

    public static double bisektris_bc(double b, double c, double bc)
    {
        double    p = 2 * b * c * Math.cos (bc / 2);
        double    bis = p / (b + c);
        return bis;
    }

    public static double bisektris_ac(double a, double c, double ac)
    {
        double    p = 2 * a * c * Math.cos (ac / 2);
        double    bis = p / (a + c);
        return bis;
    }

    public static double inskriven (double a, double b, double c)
    {
        double omkretsen = a + b + c;
        double s = omkretsen / 2;
        double inskriven = Math.sqrt(((s-a)*(s-b)*(s-c))/s);
        return inskriven;

    }
   
    public static double omskriven (double a, double b, double c)
    {
        double omkretsen = a + b + c;
        double s = omkretsen / 2;
        double omskriven = (a*b*c) / (4 * (Math.sqrt(s * ((s-a) * (s-b) * (s-c)) )));
        return omskriven;
    }
}