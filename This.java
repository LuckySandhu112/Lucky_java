class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        this.show();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void show()
    {
        System.out.println("Student Details:");
    }
}

public class ThisKeywordExample
{
    public static void main(String[] args)
    {
        Student s1 = new Student("John", 20);
        s1.display();
    }
}
