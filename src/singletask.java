import java.io.*;
import java.lang.*;
import java.util.Scanner;
class my extends Thread {
    public void run(){
        task1();
        task2();
        task3();
    }
    void task1(){
        System.out.println("This is task 1");
    }
    void task2(){
        System.out.println("This is task 2");
    }
    void task3(){
        System.out.println("This is task 3");
    }
}
public class singletask {
    public static void main(String args[])
    {
        my obj=new my();
        Thread t=new Thread(obj);
        t.start();
    }
}
