import java.util.*;

public class Three_Great_Candidates
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
        int arr[] = {9,6,3,1,3};
        for(int num1 = 0;num1 < arr.length - 1;num1++)
            {
                for(int num2 = 0; num2< arr.length - num1 - 1; num2++)
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
        System.out.println("The product of three greatest numbers: " + (arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]));
    }
}
