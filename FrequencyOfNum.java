import java.util.Scanner;

public class FrequencyOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }

        for (int i = 0; i < n; i++)
        {
            if (freq[i] == -1)
            {
                int count = 1;
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }

        System.out.println("Frequency of each number:");
        for (int i = 0; i < n; i++)
        {
            if (freq[i] != 0)
            {
                System.out.println(arr[i] + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}
