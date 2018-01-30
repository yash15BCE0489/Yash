import java.io.*;
import java.util.Scanner;
public class verify {
    public static void main(String arg[])
    {
        int x1,y1,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Dimension for 1st matrix");
        System.out.println("Enter number of rows");
        x1=in.nextInt();
        System.out.println("Enter number of column");
        y1=in.nextInt();
        int a[][]=new int[x1][y1];
        System.out.println("Enter the element ");
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y1;j++)
            {
                
                a[i][j]=in.nextInt();
            }
        }
        
    }
}
