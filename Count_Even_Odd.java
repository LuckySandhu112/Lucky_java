public class Count_Even_Odd
{
    public static void main(String[] args)
    {
        int[] arr = {7, 4, 2, 2, 5, 9, 6};
        int even = 0, odd = 0;
        for (int num = 0; num < arr.length; num++)
        {
            if (arr[num] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
