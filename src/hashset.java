import java.util.*;
public class hashset {
    public static void main(String args[])
    {
        HashSet<String> a=new HashSet<String>();
        Scanner in=new Scanner(System.in);
         for (int i=0;i<5;i++)
         {
             String s=in.next();
             a.add(s);
         }
         System.out.println("Hash set = "+a);
         Iterator i=a.iterator();
         System.out.println("Element using Iterator");
         while(i.hasNext())
         {
             String s=(String)i.next();
             System.out.println(s);
         }
    }
}
