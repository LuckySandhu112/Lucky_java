import java.util.*;
public class Stock_Buy_And_Sell
{
    public static int MaxProfit(int arr[])
    {
        int Array = arr.length;
        int a = 0;
        for (int num1 = 0; num1 < Array - 1; num1++)
        {
            for (int num2 = num1 + 1; num2 < Array; num2++)
            {
                a = Math.max(a, arr[num2] - arr[num1]);
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        int arr[] = {7,3,0,1,9,2,3};
        System.out.println(MaxProfit(arr));
    }
}
