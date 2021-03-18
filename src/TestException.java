public class TestException {

    // This method should be run for test 'finally'
    public void ShouldBeRun()
    {
        System.out.println("ShouldBeRun");
    }

    public static void main(String[] args)
    {
        TestException te = new TestException();
        int c = 0;

        // You can write codes you want to try, which may cause an exception.
        try
        {
            c = 4/0;
        }
        // This grammar helps running codes that suggest another codes when an exception happens.
        // In this case, ArithmeticException will happen after running code because a number can't be divide by 0.
        catch(ArithmeticException e)
        {
            c = -1;
        }
        // This grammar helps running codes that should be run even if an exception happens.
        finally
        {
            System.out.println(c);
            te.ShouldBeRun();
        }
    }
}
