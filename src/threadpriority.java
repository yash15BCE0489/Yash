import java.io.*;
import java.util.Scanner;
public class threadpriority extends Thread {
    public void run()
    {
        System.out.println("running thread name: "+Thread.currentThread().getName());
        System.out.println("running thread priority: "+Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        threadpriority m1 =new threadpriority();
        threadpriority m2 =new threadpriority();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
