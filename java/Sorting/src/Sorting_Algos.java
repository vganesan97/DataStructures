/**
 * Created by vishaalganesan on 8/6/16.
 */

public class Sorting_Algos
{

    //simple swap method to be used in following methods
    public void swap(int i, int j, int[] arr)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //sorting from min to max

    //bubble sort
    public int[] bubble(int[] arr)
    {
        int l=arr.length;

        for (int i = 0; i <=l; i++)
        {
            for (int j=0; j<=l-i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    swap(arr[j], arr[j+ 1], arr);

                }
            }
        }
        return arr;
    }

}

