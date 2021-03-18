import java.util.ArrayList;

// It can be chosen as 'extends Thread' or 'implements Runnable' depending on purpose
public class TestJoin implements Runnable {

    int seq;

    public TestJoin(int seq)
    {
        this.seq = seq;
    }

    public void run()
    {
        System.out.println(seq + " Thread run");
        try
        {
            Thread.sleep(1000);                     // Waiting an 1 second between run and end.
        }
        catch(Exception e)
        {

        }
        System.out.println(seq + " Thread end");

    }

    public static void main(String[] args)
    {
        ArrayList<Thread> alt = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            Thread tj = new Thread(new TestJoin(i));    // If the file inherits Thread, you can write as Thread tj = new TestJoin(i)
            tj.start();
            alt.add(tj);                                // Add objects that extend Thread into ArrayList<Thread>
        }

        for (Thread t : alt) {
            try {
                t.join();                           // It helps threads to wait until all of them will end.
            } catch (Exception e) {

            }
        }

        System.out.println("main end");

    }
}
