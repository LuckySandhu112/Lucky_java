import java.util.Scanner;

public class FrequencyOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int number = sc.nextInt();

        int[] arr = new int[number];
        int[] freq = new int[number];
        
        System.out.println("Enter " + number + " numbers:");
        for (int row = 0; row < n; row++)
        {
            arr[row] = sc.nextInt();
            freq[row] = -1;
        }

        for (int row = 0; row < number; row++)
        {
            if (freq[row] == -1)
            {
                int count = 1;
                for (int column = row + 1; column < number; column++)
                {
                    if (arr[row] == arr[column])
                    {
                        count++;
                        freq[column] = 0;
                    }
                }
                freq[row] = count;
            }
        }

        System.out.println("Frequency of each number:");
        for (int row = 0; row < number; row++)
        {
            if (freq[row] != 0)
            {
                System.out.println(arr[row] + " occurs " + freq[row] + " time(s)");
            }
        }
    }
}
