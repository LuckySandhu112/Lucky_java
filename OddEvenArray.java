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
        for (int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i]%2==0)
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
