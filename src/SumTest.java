public class SumTest {
    public int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
      int x = 4;
      int y = 6;
      int z;

      SumTest test = new SumTest();
      z = test.sum(x,y);

      System.out.println(z);
    }
}
