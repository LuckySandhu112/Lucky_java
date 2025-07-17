import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int num = scan.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter " + num + " integers:");
        for (int number = 0;number < number; number++)
        {
            arr[number] = scan.nextInt();
        }

        System.out.println("You entered:");
        for (int number = 0; number < num; number++)
        {
            System.out.print(arr[number] + " ");
        }

        scan.close();
    }
}
