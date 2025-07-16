 import java.util.Scanner;
public class Duplicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        System.out.println("Duplicate letters:");

        for (int rows = 0; rows < str.length(); rows++)
        {
            char ch = str.charAt(rows);
            int count = 0;

            for (int columns = 0;columns < str.length(); columns++)
            {
                if (str.charAt(columns) == ch)
                {
                    count++;
                }
            }

            boolean alreadyPrinted = false;
            for (int num = 0; num < rows; num++)
            {
                if (str.charAt(num) == ch)
                {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (count > 1 && !alreadyPrinted)
            {
                System.out.println(ch + " appears " + count + " times");
            }
        }
    }
}
