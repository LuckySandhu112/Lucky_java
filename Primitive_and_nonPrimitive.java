import java.util.*;
class PArray
{
    public void display()
    {
        int numbers[] = {1, 5, 7 ,8, 9};
        System.out.println("Primitive Array Elements: ");
        for(int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
class NPArray
{
    public void display()
    {
        String[] names = {"Lucky", "Vicky", "Abhay"};
        System.out.println("Non-Primitive elements:");
        for (String name : names)
        {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
public class PNP
{
    public static void main(String[] args) {
        PArray primitive = new PArray();
        primitive.display();

        NPArray nonPrimitive = new NPArray();
        nonPrimitive.display();
    }
}
