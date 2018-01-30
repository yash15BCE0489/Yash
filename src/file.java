import java.io.*;
import java.util.Scanner;
public class file {
    public static void main(String args[])
            throws IOException
    {
        
        FileInputStream dis=new FileInputStream("shivi.txt");
        //FileOutputStream fout=new FileOutputStream("shivi.txt");
        BufferedInputStream in=new BufferedInputStream(dis);
        //String s=in.next();
        int ch;
        while ((ch=in.read())!= -1)
        {System.out.print((char)ch);}
        in.close();
    }
}
