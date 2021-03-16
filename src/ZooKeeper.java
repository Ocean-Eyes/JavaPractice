public class ZooKeeper {

    // Use an interface, 'Predator' to avoid implementing method, 'feed'.
    // Then, programmer just need to implement getFood() in each class.
    // And there's no need to overload an method, 'feed' like below when you do that.

    /* public void feed(Crocodile crocodile) {
            System.out.println("feed strawberry");
     }


       public void feed(Leopard leopard) {
            System.out.println("feed orange");
     }
    */

    public void feed(Predator predator)
    {
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[] args)
    {
        // 'tiger'/'lion' are objects of 'Tiger'/'Lion' and objects of 'Predator' at the same time.
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        ZooKeeper zookeeper = new ZooKeeper();

        //
        zookeeper.feed(tiger);
        zookeeper.feed(lion);
    }
}
