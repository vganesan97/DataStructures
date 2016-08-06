/**
 * Created by vishaalganesan on 8/6/16.
 */

public class Sorting_Algos
{

    //simple swap method to be used in following methods
    public static void swap(int i, int j, int[] arr)
    {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //sorting from min to max

    //bubble sort
    public static int[] bubble(int[] arr)
    {
        int l=arr.length;

        for (int i = 0; i <l-1; i++)
        {
            for (int j=0; j<l-1-i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    swap(j, j+ 1, arr);

                }
            }
        }
        return arr;
    }

    //insertion sort
    public static int[] insertion(int[] arr)
    {
        int l=arr.length;

        for (int i=1; i<l; i++)
        {
            int k=arr[i];
            int j=i-1;

            while (j>=0 && k<arr[j])
            {
                swap(j,j+1,arr);
                j--;
            }
        }

        return arr;
    }

    //selection sort
    public static int[] selection(int[] arr)
    {
        int l=arr.length;

        for (int i=0; i<l; i++)
        {
            int x=arr[i];
            int y=i;

            for (int j=y+1; j<arr.length; j++)
            {
                if (arr[j]<x)
                {
                    x=arr[j];
                    y=j;
                }
            }

            swap(y,i,arr);
        }

        return arr;
    }

    //merge two arrays
    public static int[] merge(int[] arr, int[] arr1)
    {
        int[] arr3=new int[arr.length+arr1.length-1];
        int ptr;

        for (int i=0; i<arr.length; i++)
        {
            arr3[i]=arr[i];
        }

        ptr=arr.length+1;

        for (int j=0; j<arr1.length; j++)
        {
            arr3[ptr+j-2]=arr1[j];
        }

        return arr3;
    }

}

