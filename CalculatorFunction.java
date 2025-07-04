import java.util.*;

public class CalculatorFunction
{
    static int add(int First, int Second)
    {
        return First + Second;
    }
    static int subtract(int First, int Second)
    {
        return First - Second;
    }
    static int multiply(int First, int Second)
    {
        return First * Second;
    }
    static int divide(int First, int Second)
    {
        return First / Second;
    }
    static int remainder(int First, int Second)
    {
        return First % Second;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Addition-1, For Subtraction-2, For Multiplication-3, For Division-4, For Remainder-5");
        int choice = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("The Addition is: " + add(num1, num2));
                break;
            case 2:
                System.out.println("The Subtraction is: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("The Multiplication is: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("The Division is: " + divide(num1, num2));
                break;
            case 5:
                System.out.println("The Remainder is: " + remainder(num1, num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
