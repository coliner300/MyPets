public abstract class Pet
{
    private String name;
    private int age;
    private double weight; //in kilograms

    public Pet(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight;

        return output;
    }
}
