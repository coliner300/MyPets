public class MyPetsDriver
{
    public static void main(String[] args)
    {
        Dog Hitler = new Dog("Anne Frank", "Burned", 0, 4.0);
        Lizard Zuckerberg = new Lizard("Zuckerberg", "Blue-Tongued SKANK", 8, 2);
        IndianPet Tharushi = new IndianPet("Tharushi", "Indian Arab Thing", 7, 1.2, "Dot on forehead");
        //Pet secret = new Pet("Secret", 7, 40.2); Pet is an abstract class and cannot be instantiated
        
        System.out.println(Hitler);
        System.out.println();
        System.out.println(Zuckerberg);
        System.out.println();
        System.out.println(Tharushi);
    }
}
