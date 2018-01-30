import java.io.*;
import java.util.zip.*;
public class zip {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("shivi.txt");
        FileOutputStream fos= new FileOutputStream("compressed");
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);
        int d;
        while ((d=fis.read())!=-1)
        {
            dos.write(d);
        }
        fis.close();
        dos.close();
    }
}
