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
        for (int i = 0; i < 5; i++)
        {
            Array1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 elements for array b:");
        for (int i = 0; i < 5; i++)
        {
            Array2[i] = sc.nextInt();
        }

        System.out.println("Sum of arrays:");
        for (int i = 0; i < 5; i++)
        {
            Sum[i] = Array1[i] + Array2[i];
            System.out.println(Sum[i]);
        }

    }
}
