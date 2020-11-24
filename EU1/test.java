package EU1;
class test
{

public static void main(String[] args) {
    int[] sequence = {1,2,3,4,5,7};

    reverseSequenceEfficiently(sequence);
    for(int i = 0; i < sequence.length; i++)
    {
        System.out.println(sequence[i]);
    }
}


public static void reverseSequenceEfficiently (int[] sequence)
{
    int    element;
    for (int i = 0; i < sequence.length / 2; i++){element = sequence[i];sequence[i] = sequence[sequence.length -1 -i];sequence[sequence.length -1 -i] = element;}}

}