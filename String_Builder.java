public class String_Builder
{
    public static void main(String[] args)
    {
        StringBuilder string = new StringBuilder("Lucky");
        System.out.println("Initial String: 'Lucky'");

        string.append(" Sandhu");
        System.out.println("After append: " + string);

        string.insert(5, " Singh ");
        System.out.println("After insert: " + string);

        string.replace(0, 5, "Vikrant");
        System.out.println("After replace: " + string);

        string.delete(2, 7);
        System.out.println("After delete: " + string);

        string.reverse();
        System.out.println("After reverse: " + string);
    }
}
