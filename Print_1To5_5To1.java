import java.util.*;                                       |      import java.util.*;
public class Num_1To5                                     |      public class Recursion
{                                                         |      {
    public static void printNumb(int n)                   |          public static void printNumb(int n)
                                                          |          {
    {                                                     |              if(n==0)
        if(n==6)                                          |              {
        {                                                 |                  return;
            return;                                       |              }
        }                                                 |              System.out.println(n);
        System.out.println(n);                            |              printNumb(n-1);
        printNumb(n+1);                                   |          }
    }                                                     |      
    public static void main(String args[])                |          public static void main(String args[])
    {                                                     |          {
        int n = 1;                                        |              int n = 5;
        printNumb(n);                                     |              printNumb(n);
    }                                                     |          }
}                                                         |      }
