import java.util.*;
public class SumOfNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int number = 1; number <= num; number++)
        {
            sum += number;
            System.out.print(" "+ number);
        }
        System.out.println(" "+ sum);
    }
}
