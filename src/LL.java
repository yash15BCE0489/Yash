import java.util.*;
import java.io.*;
public class LL {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        LinkedList<String> l =new LinkedList<String>();
        int c=0,p;
        String e;
        while(c<4)
        {
            System.out.println("LINKED LIST OPERATION");
            System.out.println("1. ADD AN ELEMENT");
            System.out.println("2. REMOVE AN ELEMENT");
            System.out.println("3. SEARCH AN ELEMENT");
            System.out.println("4. EXIT");
            System.out.println("YOUR CHOICE: ");
            c=in.nextInt();
            switch(c)
            {
                case 1: {System.out.println("enter element: ");
                         e=in.next();
                         System.out.println("enter position: ");
                         p=in.nextInt();
                         l.add(p-1,e);
                         break;
                        }
                case 2:{System.out.println("enter position: ");p=in.nextInt();
                    String o=l.remove(p-1);
                    System.out.println("popped= "+o);
                    break;
                }
                case 3:{
                    System.out.println("enter position: ");
                    p=in.nextInt();
                    System.out.println("enter element: ");
                    e=in.next();
                    l.set(p-1,e);
                    break;   
                }
                case 4: break;
                default: System.out.println("INVALID INPUT");
            }
            System.out.println("Linked list contents: "+l);
        }
        
    }
}
