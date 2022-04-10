import java.util.Arrays;

public class Array
{
    public static void main(String[] args)
    {
        int[] array1 = new int[5];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        //Printing Using toString
        System.out.println(Arrays.toString(array1));
        //Printing Using ForLoop
        for(int i=0;i<5;i++)
        {
            System.out.print(array1[i] + " ");

        }
        System.out.println("");
        int[] array2 = {10 , 9 , 8 , 7 , 6};
        System.out.println(Arrays.toString(array2));
        for(int i=0 ; i<array2.length ; i++)
        {
            System.out.print(array2[i] + " ");
        }
        //Sorting Array
        Arrays.sort(array2);
        System.out.println("");
        System.out.println(Arrays.toString(array2));

    }
    
}
