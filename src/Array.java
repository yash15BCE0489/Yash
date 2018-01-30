import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.util.Collection;
public class Array {
    public static void main(String arg[])
    {
        int n;
        System.out.println("No of subject");
     Scanner in=new Scanner(System.in);
     n=in.nextInt();      
     float marks[]=new float[n];
     System.out.println("Percentage= ");
     for(int i=0;i<n;i++)
     {
         System.out.println("Enter the marks of subect "+(i+1));
         marks[i]=in.nextFloat();
     }
     float total=0;
     for(int i=0;i<n;i++)
     {
         total=total+marks[i];
     }
     float highestmarks=n*100;
     float per=total/highestmarks*100;
     System.out.println("Total no of Subjects = "+n);
     for(int i=0;i<n;i++)
     {
         System.out.println("Marks of subject "+(i+1)+" :- "+marks[i]);
     }
     System.out.println("Total marks = "+total);
     System.out.println("Percentage= "+per);
    }
}
