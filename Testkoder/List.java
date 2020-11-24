package Testkoder;

public class List
{

    private int[] elements;

    public List (int[] elements)
    {

        //this.elements = elements;

        this.elements = new int[elements.length];
        for(int i=0; i < elements.length; i++)
        {
            this.elements[i] = elements[i];
        }
    }

    public void add (int element)
    {
        int [] a = new int[this.elements.length + 1];
        for (int i = 0; i < elements.length; i++)
        {
            a[i] = this.elements[i];
            a[a.length-1] = element;
            this.elements = a;
        }
    }

    public int size()
    {
        return this.elements.length;
    }

    public boolean contains (int element)
    {
        boolean hasElement = false;
        for (int i = 0; i < this.elements.length; i++)
        {
            if (this.elements[i] == element)
            {
                hasElement = true;
                break;
            }
        }
        return hasElement;
    }

    public List clone ()
    {
        int[] a = new int[this.elements.length];
        for (int i = 0; i < this.elements.length; i++)
        {
            a[i] = this.elements[i];
        }
        List list = new List(a);
        return list;
    }
}