public class TestThread extends Thread {

    int seq;
    public TestThread(int seq)
    {
        this.seq = seq;
    }

    // It will be run when a thread starts
    public void run()
    {
        System.out.println(seq + " Thread run");

        try { Thread.sleep(1000); }              // Make an 1 sec between run and end.
        catch (Exception e) { }

        System.out.println(seq + " Thread end");
    }

    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            TestThread tt = new TestThread(i);
            tt.start();
        }
        System.out.println("main end");             // main even ends when there are threads that still run.
    }
}
