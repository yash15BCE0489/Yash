import java.util.*;
import java.util.Stack;
import java.io.*;
public class stack1 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack<Integer> s =new Stack<Integer>();
        int c=0,p,e;
        while(c<4)
        {
            System.out.println("STACK OPERATION");
            System.out.println("1. PUSH AN ELEMENT");
            System.out.println("2. POP AN ELEMENT");
            System.out.println("3. SEARCH AN ELEMENT");
            System.out.println("4. EXIT");
            System.out.println("YOUR CHOICE: ");
            c=in.nextInt();
            switch(c)
            {
                case 1: {System.out.println("enter element: ");
                         e=in.nextInt();
                         s.push(e);
                         break;
                        }
                case 2:{int o=s.pop();
                    System.out.println("popped= "+o);
                    break;
                }
                case 3:{
                    System.out.println("Which element? ");
                    e=in.nextInt();
                    p=s.search(e);
                    if(p==-1)
                    {
                        System.out.println("Element not found");
                    }
                    else
                    {
                        System.out.println("Position :"+p);
                    }
                    break;   
                }
                case 4: break;
                default: System.out.println("INVALID INPUT");
            }
            System.out.println("Stack contents: "+s);
        }
        
    }
}
