import java.util.*;
import java.io.*;
public class vec {
    public static void main(String args[])
    {
        Vector<Integer> v=new Vector<Integer>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int a=in.nextInt();
            v.add(a);
        }
        System.out.println(v);
        ListIterator l=v.listIterator();
        while(l.hasNext())
        {
            System.out.print(l.next()+"\t");
        }
        while(l.hasPrevious())
        {
            System.out.print(l.previous()+"\t");
        }
        
    }
}