import java.io.*;
import java.util.zip.*;
public class unzip {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("compressed");
        FileOutputStream fos= new FileOutputStream("uncompressed.txt");
        InflaterInputStream iis = new InflaterInputStream(fis);
        int d;
        while ((d=iis.read())!=-1)
        {
            fos.write(d);
        }
        fos.close();
        iis.close();
    }
}
