/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.Scanner;

/**
 *
 * @author Yash Agarwal
 */
public class java {
    
    public static void main(String args[])
    {
        int n =1000,i;
        int a[] =new int[1000];
        Scanner in = new Scanner(System.in);
        int c=0;
        for(i=1;i<n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                a[c]=i;
                c++;
            }
            else if(i%3==0)
            {
                a[c]=i;
                c++;
            }
            else if(i%5==0)
            {
                a[c]=i;
                c++;
            }
        }
        int s = 0;
        for (i=0;i<a.length;i++)
        {
            s += a[i];
        }
        System.out.println(s);
    }
    
}
