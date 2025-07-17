public class Main
{
    static class Shallow_deep
    {
        int copy;
    }

    public static void main(String[] args)
    {
        // Original object
        Shallow_deep original = new Shallow_deep();
        original.copy = 11;

        // Shallow copy
        Shallow_deep shallow = original;

        // Deep copy
        Shallow_deep deep = new Shallow_deep();
        deep.copy = original.copy;

        // Change original copy
        original.copy = 60;

        // Print results
        System.out.println("Original: " + original.copy);
        System.out.println("Shallow Copy: " + shallow.copy);
        System.out.println("Deep Copy: " + deep.copy);
    }
}
