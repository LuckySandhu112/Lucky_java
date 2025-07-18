class Animal
{
    private String Animal;
    int Height;
    public String Eat;

    public void setName(String AnimalName)
    {
        Animal = AnimalName;
    }

    public String getAnimal()
    {
        return Animal;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Animal Scanner = new Animal();

        Scanner.setName("Cheetah");
        System.out.println("Animal: " + Scanner.getAnimal());

        Scanner.Height = 10;
        System.out.println("Height: " + Scanner.Height);

        Scanner.Eat = "Non-Veg";
        System.out.println("Eat: " + Scanner.Eat);
    }
}
