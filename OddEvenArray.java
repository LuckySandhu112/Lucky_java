import java.util.*;
public class OddEvenArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int even=0,odd=0;
        System.out.println("Enter " + num + " numbers:");
        for (int row=0;row<num;row++)
        {
            arr[row] = sc.nextInt();
            if (arr[row]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}
