import java.io.*;
import java.util.Scanner;
class Sachin{
    String name;
    int cost;
    void Sachin(){
        System.out.println("initialised");
        name="Khushi";
        cost=20000;
    }
    void print(){
        System.out.println(name+" Rs "+cost);
        
    }
}
class deepak extends Sachin{
    int size;
    int quantity;
    void get(){
        Scanner in=new Scanner(System.in);
        size=in.nextInt();
        quantity=in.nextInt();
    }
    void prints(){
        print();
        System.out.println(size+"  "+quantity);
        
    }
}
public class inheritence {
    public static void main(String args[])
    {
        deepak y=new deepak();
        y.Sachin();
        y.get();
        y.prints();
    }
}
