/**
 * Created by vishaalganesan on 8/6/16.
 */

import java.util.Random;
import java.lang.Object;

public class Main {

    public static void toString(int[] arr)
    {
        for (int j=0; j<arr.length-1; j++)
        {
            System.out.print(arr[j]+ " ");

        }
    }
    public static void main(String[] args)
    {

        Random r= new Random();
        Sorting_Algos sorting_algos=new Sorting_Algos();

        int[] arr=new int[10];
        int l=arr.length;

        for (int i=0; i<l-1; i++)
        {
            int x = r.nextInt(100);
            arr[i] = x;
        }

        System.out.print("Unsorted Array: ");
        System.out.println();
        toString(arr);
        System.out.print("Sorted Array: ");
        //sorting_algos.bubble(arr);
        //sorting_algos.insertion(arr);
        sorting_algos.selection(arr);
        toString(arr);
    }
}
