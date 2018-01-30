import  java.io.*;
import java.util.Scanner;
public class bubblesort {
    public static void main(String arg[])
    {Scanner in=new Scanner(System.in);
    System.out.println("Array size");
    int x=in.nextInt();
    int a[]=new int[x];
    System.out.println("Unsorted Array");
    for(int i=0;i<x;i++)
    {
        a[i]=in.nextInt();
    }
    int temp;
    for(int i=0;i<x;i++)
    {for(int j=i+1;j<x;j++)
    {if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }}
    }
    System.out.println("Sorted array");
    for(int i=0;i<x;i++)
    {
        System.out.println(a[i]);
    }
    }
}
