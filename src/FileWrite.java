import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\~\\test_fos.txt");
//        FileWriter fw = new FileWriter("C:\\Users\\~\\test_fw.txt");
//        PrintWriter pw = new PrintWriter("C:\\Users\\~\\test_pw.txt");
        String str;

        // Use FileOutputStream -> Byte
/*
        for(int i = 0; i < 10; i++)
        {
            str = i + "번째 데이터 입니다.\r\n";
            fos.write(str.getBytes());
        }

        fos.close();

        FileOutputStream fos2 = new FileOutputStream("C:\\Users\\~\\test_fos.txt",true);

        str = "파일 다시열기 테스트 by FileOutputStream\r\n";

        fos2.write(str.getBytes());

*/

        // Use FileWriter -> String
/*
        fw.write("Written by FileWriter\r\n");

        for(int i = 0; i < 10; i++)
        {
            str = i + "번째 데이터 입니다.\r\n";
            fw.write(str);
        }

        fw.close();

        FileWriter fw2 = new FileWriter("C:\\Users\\~\\test_fw.txt",true);
        fw2.write("파일 다시열기 테스트 by FileWriter\r\n");

        fw2.close();

*/

        // Use PrintWriter -> There's no need to use '\r\n' to go next line
/*
        pw.println("Written by PrintWriter");

        for(int i = 0; i < 10; i++)
        {
            str = i + "번째 데이터 입니다.";
            pw.println(str);
        }

        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\~\\test_pw.txt",true));
        pw2.println("파일 다시열기 테스트 by PrintWriter");

        pw2.close();

*/

    }

}
