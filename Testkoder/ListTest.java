package Testkoder;

class ListTest
{
    public static void main (int[] args)
    {

        int[] v = {1,2,3,4};

        List list = new List(v);

        list.add (5);

        int size = list.size();

        System.out.println(size);

        boolean has = list.contains(4);

        System.out.println(has);
    }


}