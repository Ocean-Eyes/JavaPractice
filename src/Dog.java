public class Dog extends Animal{
    public void sleep()
    {
        System.out.println(this.name + " zzz");
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setName("Nureong");
        System.out.println(dog.name);
        dog.sleep();
    }
}
