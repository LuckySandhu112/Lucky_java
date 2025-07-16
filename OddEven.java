import java.util.*;
public class OddEven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int number=1;number<=num;number++)
        {
            if(number%2==0)
            {
                System.out.print(" Even number: "+ number);
            }
            else
            {
                System.out.print(" Odd number: "+ number);
            }
        }
    }
}
