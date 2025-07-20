import java.util.*;
public class Second_Largest_Element
{
    public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {1,5,3,8,4};
        int i, j;
            for(i = 0;i < arr.length - 1;i++)
            {
                for(j = 0; j< arr.length - i - 1; j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            printArray(arr);
            System.out.println(" The second largest element: "+ arr[arr.length - 2]);
    }
}
