public class WildDog extends Dog{
    public void sleep()
    {
        System.out.println(this.name + " zzz outside");
    }

    public void sleep(int hours)
    {
        System.out.println(this.name + " zzz outside for" + hours);
    }

    public static void main(String[] args)
    {
        WildDog wilddog = new WildDog();
        wilddog.setName("strong");
        wilddog.sleep();                    // Method Overriding  => It has a same input, but functions differently
        wilddog.sleep(3);             // Method Overloading => It has a different input
    }
}
