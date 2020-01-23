public class IndianPet extends Pet
{
    private String species;
    private String feature;

    public IndianPet(String name, String breed, int age, double weight, String feature)
    {
        super(name, age, weight);
        this.species = breed;
        this.feature = feature;
    }//end full constructor will call to super

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;
        output += "\nFeature: " + feature;

        return output;
    }//end toString with call to super
}//end class lizard which is a pet
