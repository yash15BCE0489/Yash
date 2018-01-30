import java.io.*;
import java.util.zip.*;
public class copy {
 public static void main(String args[]) throws IOException
    {
        FileInputStream fis=new FileInputStream("shivi.txt");
        FileOutputStream fos= new FileOutputStream("1.txt");
        int d;
        while ((d=fis.read())!=-1)
        {
            fos.write(d);
        }
        fos.close();
        fis.close();
    }
}
