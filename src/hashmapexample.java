
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash Agarwal
 */
class information
{
    String name;
    int age;
    void get(String n , int i)
    {
        this.name = n;
        this.age = i;
    }
    void p()
    {
        System.out.println("Name :-> "+this.name);
        System.out.println("age :-> "+this.age);
    }
}
public class hashmapexample {
    public static void main(String[] args)
    {
    HashMap<information,String> q = new HashMap<information,String>();
    String D="", n ="";
    int a=0;
    information w = new information();
    Scanner in =new Scanner(System.in);
    System.out.println("Enter number of people you want to store");
    int p = in.nextInt();
    for(int i=0;i<p;i++)
    {
     System.out.println("Enter Department");
     D = in.next();
    System.out.println("Enter name");
    n = in.next();
    System.out.println("Enter age");
    a = in.nextInt();
    w.get(n, a);
    q.put(w, D);
    }
    Iterator i = q.entrySet().iterator();
    while(i.hasNext())
    {
        String value = i.next().toString();
        String key = i.next().toString();
        
        System.out.println("Department :-> "+value);
        System.out.println("key :-> "+key);
    }
    }
}
