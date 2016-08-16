/**
 * Created by vishaalganesan on 8/6/16.
 */

import java.util.Random;
import java.lang.Object;

public class Main
{

    public static void toString1(int[] arr)
    {
        System.out.print("Original Array: ");

        for (int j=0; j<arr.length-1; j++)
        {
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }

    public static void toString2(int[] arr)
    {
        System.out.print("Sorted Array: ");

        for (int j=0; j<arr.length-1; j++)
        {
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }

    public static void toString(int[] arr)
    {
        for (int j = 0; j < arr.length - 1; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {

        Random r= new Random();
        Sorting_Algos sorting_algos=new Sorting_Algos();

        int[] arr=new int[10];
        int[] arr1=new int[10];
        int l=arr.length;

        for (int i=0; i<l-1; i++)
        {
            int x = r.nextInt(100);
            int y=r.nextInt(100);
            arr[i]=x;
            arr1[i]=y;
        }

        toString1(arr);
        toString2(Sorting_Algos.merge_sort(arr,1,l));
        System.out.println();

    }
}
