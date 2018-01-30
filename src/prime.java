import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author yash
 */
public class prime {
    public static void main(String args[])
    {
long n=0,i,a=0,j;
        for(j=100000000;j<=999999999;j++)
        {n=j;
            a=0;
        
        for(i=2;i<=n-1;i++);
        if(n%i==0)
        {
            a=1;
        }
        if(a==0)
        {
            System.out.println("Prime : "+n);
        }        
    }
    }}