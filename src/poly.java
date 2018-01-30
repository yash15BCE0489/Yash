import java.io.*;
import java.util.Scanner;
class yash{
    public static int x,q,z;
    void get()
    {
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        q=in.nextInt();
        //z=in.nextInt();
    }
    void add(int x,int y)
    {
        System.out.println(x+y);
    }
    void add(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
};
public class poly {
    
    public static void main(String arg[])
    {
        yash y=new yash();
        y.get();
        y.add(y.x,y.z);
        y.add(y.x,y.q,y.z);
        
    }
}
