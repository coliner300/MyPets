public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.species = breed;
    }//end full constructor will call to super

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;

        return output;
    }//end toString with call to super
}//end class lizard which is a pet
