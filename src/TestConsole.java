import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class TestConsole {

    public static void main (String[] args) throws Exception
    {
        // Use InputStream -> Byte
        /*
        ------------------------------------
        InputStream is = System.in;
        Byte[] x = new Byte[3];

        x = is.read();

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        ------------------------------------
        */

        // Use InputStreamReader -> Char
        /*
        ------------------------------------
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        char[] x = new char[3];

        isr.read(x);
        System.out.println(x);
        ------------------------------------
        */

        // Use BufferedReader -> String

        /*
        ------------------------------------
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String x = br.readLine();
        System.out.println(x);
        ------------------------------------
         */

        // Use Scanner
        Scanner sn = new Scanner(System.in);
        System.out.println(sn.nextLine());
    }

}
