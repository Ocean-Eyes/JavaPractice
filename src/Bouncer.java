public class Bouncer {

    // It receives Barkable, but can be received BarkablePredator because it inherits Barkable.
    public void barkAnimal(Barkable animal)
    {
        animal.bark();
    }

    public static void main(String[] args)
    {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bouncer bouncer = new Bouncer();


        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);           // lion is object of BarkablePredator, which inherits Barkable and Predator, so it can be worked.
    }

}
