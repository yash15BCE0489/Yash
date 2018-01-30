import java.io.*;
import java.util.Scanner;
public class Class {

    static void forName(String commysqljdbcDriver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String name;
    int rollno;
    void get()
    {
        Scanner in=new Scanner(System.in);
        rollno=in.nextInt();
        name=in.next();
    }
    void display()
    {
        System.out.println("Roll no of student = "+rollno);
        System.out.println("Name of student = "+name);
    }
    
    public static void main(String arg[])
    {
        Class r=new Class();
        r.get();
        r.display();
    }
}
