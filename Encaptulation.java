class Student
{
    private String name;
    private int age;

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int newAge)
    {
        if (newAge > 0)
        {
            age = newAge;
        }
        else
        {
            System.out.println("Age must be positive");
        }
    }

    public int getAge()
    {
        return age;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Student scan = new Student();

        scan.setName("John");
        scan.setAge(20);

        System.out.println("Student Name: " + scan.getName());
        System.out.println("Student Age: " + scan.getAge());
    }
}
