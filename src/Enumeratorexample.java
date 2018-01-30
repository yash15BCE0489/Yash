/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash Agarwal
 */
import java.util.*;
public class Enumeratorexample {
    public static void main(String[] args)
    {
        Vector v = new Vector();
        Enumeration e;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Members in a family");
        int n = in.nextInt();
        System.out.println("Enter NAMES IN A FAMILY");
        for(int i=0;i<n;i++)
        {
            String q = in.next();
            v.add(q);
        }
        e = v.elements();
        int c=0;
        while(e.hasMoreElements())
        {
            
            c++;
            System.out.println(c+" :-> "+e.nextElement());
            
        }
    }
}
