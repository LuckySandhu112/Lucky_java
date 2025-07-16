import java.util.*;
public class ArrayBorder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int rows=0;rows<3;rows++)
        {
            for(int columns=0;columns<3;columns++)
            {
                arr[rows][columns]=sc.nextInt();
            }
        }
        for(int rows=0;rows<3;rows++)
        {
            for(int columns=0;columns<3;columns++)
            {
                if(rows==1&&columns==1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(arr[rows][columns]+ " ");
                }
            }
            System.out.println();
        }
    }
}
