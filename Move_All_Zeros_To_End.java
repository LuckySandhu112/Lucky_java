public class Move_All_Zeros_To_End
{
    public static void moveZerosToEnd(int[] arr)
    {
        int pos = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                arr[pos] = arr[i];
                pos++;
            }
        }

        for (int i = pos; i < arr.length; i++)
        {
            if (i >= pos)
            {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {0, 5, 0, 3, 0, 2, 7};
        moveZerosToEnd(arr);
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
