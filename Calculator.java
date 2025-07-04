import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Addition-1, For Subtraction-2, For Multiplication-3, For Division-4, For Remainder-5 ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num3 = sc.nextInt();
        switch(num1)
        {
            case 1:
            System.out.print("The Addition is: " + (num2 + num3));
            break;

            case 2:
            System.out.print("The Subtraction is: " + (num2 - num3));
            break;

            case 3:
            System.out.print("The Multiplication is: " + (num2 * num3));
            break;

            case 4:
            System.out.print("The Division is: " + (num2 / num3));
            break;

            case 5:
            System.out.print("The Remainder is: " + (num2 % num3));
            break;

            default:
            System.out.print("Invalid "); 
        }
    }
}
