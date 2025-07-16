import java.util.Scanner;
public class SumOfArrays
{
    public static void main(String[] args)
    {
        int[] Array1 = new int[5];
        int[] Array2 = new int[5];
        int[] Sum = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements for array a:");
        for (int row = 0; row < 5; row++)
        {
            Array1[row] = sc.nextInt();
        }

        System.out.println("Enter 5 elements for array b:");
        for (int row = 0; row < 5; row++)
        {
            Array2[row] = sc.nextInt();
        }

        System.out.println("Sum of arrays:");
        for (int row = 0; row < 5; row++)
        {
            Sum[row] = Array1[row] + Array2[row];
            System.out.println(Sum[row]);
        }

    }
}
