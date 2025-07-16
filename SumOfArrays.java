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
        for (int number = 0; number < 5; number++)
        {
            Array1[number] = sc.nextInt();
        }

        System.out.println("Enter 5 elements for array b:");
        for (int number = 0; number < 5; number++)
        {
            Array2[number] = sc.nextInt();
        }

        System.out.println("Sum of arrays:");
        for (int number = 0; number < 5; number++)
        {
            Sum[number] = Array1[number] + Array2[number];
            System.out.println(Sum[number]);
        }

    }
}
