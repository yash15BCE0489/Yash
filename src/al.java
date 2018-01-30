import java.io.*;
import java.util.*;
public class al {
    public static void main(String args[])
    {
        ArrayList<String> a=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            String s=in.next();
            a.add(s);
        }
        System.out.println("The list is:"+a);
        System.out.println("Removing element");
        String S=in.next();
        a.remove(S);
        a.add(0,"yash");
        a.add(1,"harshit");
        System.out.println("The list is:"+a);
        
    }
}
