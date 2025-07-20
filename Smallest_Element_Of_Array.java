import java.util.*;
public class Smallest_Element_Of_Array
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
        int arr[] = {1,5,3,8,4};
        int num1, num2;
            for(num1 = 0;num1 < arr.length - 1;num1++)
            {
                for(num2 = 0; num2< arr.length - num1 - 1; num2++)
                {
                    if(arr[num2]>arr[num2+1])
                    {
                        int temp = arr[num2];
                        arr[num2] = arr[num2+1];
                        arr[num2+1] = temp;
                    }
                }
            }
            printArray(arr);
            System.out.println(" The smallest element of Array: "+ arr[0]);
    }
}
