import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class multitask extends Thread {
    String s;
    public void run(){
        for (int i=0;i<10;i++)
        {
            System.out.println(s+":"+i);
            try{Thread.sleep(2000);}
            catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
class a {
    public static void main(String args[]){
        multitask obj1=new multitask();
        obj1.s="my name is yash";
        multitask obj2=new multitask();
        obj2.s="my name is shivi";
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }  
}
