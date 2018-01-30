import java.io.*;
import java.util.Scanner;

public class twodarray {
    public static void main(String arg[])
    {
        int x1,y1,x2,y2,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Dimension for 1st matrix");
        System.out.println("Enter number of rows");
        x1=in.nextInt();
        System.out.println("Enter number of column");
        y1=in.nextInt();
        System.out.println("Dimension for 2nd matrix");
        System.out.println("Enter number of rows");
        x2=in.nextInt();
        System.out.println("Enter number of column");
        y2=in.nextInt();
        int a[][]=new int[x1][y1];
        int b[][]=new int[x2][y2];
        System.out.println("Enter the element ");
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y1;j++)
            {
                
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the element ");
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y1;j++)
            {
                
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("Sum of two matrix");
        if(x1==x2 && y1==y2)
        {
            int c[][]=new int[x1][y1];
            for(i=0;i<x1;i++)
            {
                for(j=0;j<y1;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            int q;
            for(i=0;i<x1;i++)
            {
                for(j=0;j<y1;j++)
                {
                    System.out.print(c[i][j]+"\t");
                }
                System.out.print("\n");
            }
        }
        
    }
}
