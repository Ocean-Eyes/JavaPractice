import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) throws IOException
    {
/*
        byte[] bt = new byte[1024];
        FileInputStream fis = new FileInputStream("C:\\Users\\Vitruvian\\JavaPractice\\src\\test_fos.txt");
        fis.read(bt);
        System.out.println(new String(bt));
        fis.close();
*/
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Vitruvian\\JavaPractice\\src\\test_fos.txt"));
        String str;
        while(true)
        {
            str = br.readLine();
            if(str == null)
            {
                break;
            }
            System.out.println(str);
        }
        br.close();


    }
}
