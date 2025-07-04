import java.util.*;
public class Grades
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();
        String str = (Marks>=90)?" Grade is A": (Marks>=75 && Marks<90)? "Grade is B": (Marks>=60&&Marks<75)? "Grade is C": (Marks>=40&&Marks<60)? "Grade is D": "You are fail";
        System.out.println(" "+ str);
    }
}
