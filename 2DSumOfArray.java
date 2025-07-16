import java.util.*;
public class TWODSumOfArrays
{
    public static void main(String args[])
    {
        int sum =0;
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int rows=0;rows<3;rows++)
        {
            for(int columns=0;columns<3;columns++)
            {
                arr[rows][columns] = sc.nextInt();
                if(rows==columns)
                {
                    sum+=arr[rows][columns];
                }
                else
                {
                    System.out.print("");
                }
            }
        }
        for(int rows=0;rows<3;rows++)
        {
            for(int columns=0;columns<3;columns++)
            {
                System.out.print(arr[rows][columns]);
            }
            System.out.println();
        }
        System.out.println("Sum of diagonal elements: " + sum);
    }
}
