public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    }//end full constructor will call to super

    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;

        return output;
    }//end toString will call to super
}//end class dog
