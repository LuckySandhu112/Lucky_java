import java.util.*;

public class OOPS
{
    public static void main(String args[])
    {
        Pen P1 = new Pen();
        P1.setColor("Blue");
        System.out.println(P1.color);
        P1.setTip(5);
        System.out.println(P1.tip);
    }
}

class Pen
{
    String color;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }
}
