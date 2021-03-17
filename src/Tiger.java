public class Tiger extends Animal implements Predator, Barkable {
    public String getFood()
    {
        return "apple";
    }

    public void bark()
    {
        System.out.println("어흥");
    }

}
