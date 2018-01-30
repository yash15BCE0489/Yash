/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Yash Agarwal
 */
public class fibnaccio {
    public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=34;    
 ArrayList<Integer> a = new ArrayList();
 System.out.print(n1+" "+n2);    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;
  a.add(n3);
  n1=n2;    
  n2=n3;    
 }    
 
System.out.println(a);

 ArrayList<Integer> b = new ArrayList();
 
 for(i=0;i<a.size();i++)
 {
     if(a.get(i)%2==0)
     {
         b.add(a.get(i));
     }
 }
 int s=0;
 for(i=0;i<b.size();i++)
 {
     s += b.get(i);
     
 }
 System.out.println(s);
 System.out.println(b);

}
}
