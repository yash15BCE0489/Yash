import java.io.*;
import java.util.*;
public class hs {
    public static void main(String args[])
    {
        HashMap<String,Long> h=new HashMap<String,Long>();
        int choice=0;
        Scanner in=new Scanner(System.in);
        while(choice<4)
        {
            System.out.println("1.Insert");
            System.out.println("2.search");
            System.out.println("3.Display");
            System.out.println("4.Exit");
        
        System.out.println("Enter the choice");
        choice = in.nextInt();
        switch(choice)
        {
            case 1:{
            System.out.println("Enter name");
            String name=in.next();
            System.out.println("Enter phonenumber");
            long p=in.nextLong();
            h.put(name, p);
            break;
            }
            case 2:{
                System.out.println("Enter the name");
                String name=in.next();
                long a=h.get(name);
                System.out.println("The phone number: "+a);
            break;}
            case 3:{
                Set<String> s=new HashSet<String>();
                s=h.keySet();
                System.out.println(s);
                break;
            }
            case 4:{
                break;
            }}
        }
    }
}
