public class Reverse_Of_Array
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int num = 0; num < n / 2; num++)
        {
            if (num < n - num - 1)
            {
                int temp = arr[num];
                arr[num] = arr[n - num - 1];
                arr[n - num - 1] = temp;
            }
        }
        System.out.println("Reversed Array:");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
