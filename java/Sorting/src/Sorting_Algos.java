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

}

