
public class TestException2 {
    public void sayNick(String name)
    {
        // If it's just thrown to FoolException and don't write try-catch
        // There's error but it depends on what FoolException extends.
        // If it extends RuntimeException, Runtime error happens.
        // If it extends Exception, Compile error happens.
        // i.g. RuntimeException = Unchecked Exception/ Exception = Checked Exception
        // So, you should write as try-catch to handle Exception at least you want to run the code.
        try
        {
            if ("Fool".equals(name)) {
                throw new FoolException();
            } else if ("Nick".equals(name)) {
                System.out.println("Hi, I'm Nick");
            } else {
                System.out.println("No, I'm not " + name);
            }
        }
        catch (FoolException e)
        {
            System.err.println("I'm not a fool!");
        }
    }

    public static void main(String[] args)
    {
        TestException2 te2 = new TestException2();
        te2.sayNick("Fool");
        te2.sayNick("Nick");
        te2.sayNick("Carl");


    }
}
