import java.util.*;
public class LeapYear
{
    public static void main(String args[])
    {
        int Year=2000;
        if((Year%4==0&&Year%100!=0)||(Year%400==0)) 
        {
            System.out.println(Year + " is a Leap Year.");
        }
        else
        {
            System.out.println("It is not a leap year: "+ Year);
        }
    }
}
