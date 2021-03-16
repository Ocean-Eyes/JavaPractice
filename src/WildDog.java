public class WildDog extends Dog{

    // Need to make default constructor, when you overloads constructors.
    public WildDog() { }
    // Constructor Overloading.
    public WildDog(int number)
    {
        if(number == 1)
        {
            this.setName("Shepherd");
        }
        else if(number == 2)
        {
            this.setName("Poodle");
        }
    }

    // Method Overriding  => It has a same input, but functions differently
    public void sleep()
    {
        System.out.println(this.name + " zzz outside");
    }

    // Method Overloading => It has a different input
    public void sleep(int hours)
    {
        System.out.println(this.name + " zzz outside for " + hours + "hour(s)");
    }

    public static void main(String[] args)
    {
        WildDog wilddog = new WildDog();
        WildDog wildpuppy = new WildDog(2);
        wilddog.setName("Pug");
        System.out.println("the name of wilddog is " + wilddog.name);
        System.out.println("the type of wildpuppy is " + wildpuppy.name);
        wilddog.sleep();
        wilddog.sleep(3);
    }
}
