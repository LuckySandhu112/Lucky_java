import java.util.*;

class StringReversal
{
    public static void main(String args[])
    {
        String str = "Lucky";
        String reversed = "";

        for (int word = str.length() - 1; word >= 0; word--)
        {
            reversed += str.charAt(word);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
