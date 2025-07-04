import java.util.*;
public class ATM
{
    public static void main(String[] args)
    {
        int amt=10000;
        Scanner sc = new Scanner(System.in);
        int Withdraw=sc.nextInt();
        if(Withdraw<amt)
        {
            System.out.println("Yes you can withdraw ");
            System.out.println("Balance left: "+ (amt-Withdraw));
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
}
