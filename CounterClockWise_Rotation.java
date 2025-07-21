import java.util.*;
public class CounterClockWise_Rotation
{
    public static void printArray(int arr[])
    {
        for(int num = 0; num < arr.length; num++)
        {
            System.out.print(arr[num]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {5, 2, 3, 2, 8, 7};
        for(int num1 = 0; num1 < arr.length - 1; num1++)
        {
            for(int num2 = 0; num2 < arr.length - num1 - 1; num2++)
            {
                if(arr[num1] < arr[num2])
                {
                    int temp = arr[num2];
                    arr[num2] = arr[num2+1];
                    arr[num2+1] = temp;
                }
            }
        }
        printArray(arr);
        System.out.println();
    }
}
