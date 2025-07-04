import java.util.*;
public class LargestOfThree
{
    public static void main(String args[])
    {
        int num1=7, num2=6, num3=5;
        if(num1>num2&&num1>num3)
        {
            System.out.println("A is the largest number: "+ num1);
        }
        else if(num2>num3)
        {
            System.out.println("B is the largest number: "+ num2);
        }
        else
        {
            System.out.println("C is the largest number: "+ num3);
        }
    }
}
