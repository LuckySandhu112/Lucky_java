import java.util.*;

public class Reverse_Stack
{
    public static String reverseString(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty())
        {
            reversed.append(stack.pop());
        }
        return reversed.toString();
}
    public static void main(String args[])
    {
        String input = "Lucky";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
