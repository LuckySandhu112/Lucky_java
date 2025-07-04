 import java.util.Scanner;
public class Duplicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        System.out.println("Duplicate letters:");

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(j) == ch)
                {
                    count++;
                }
            }

            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++)
            {
                if (str.charAt(k) == ch)
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
