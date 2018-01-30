import java.io.IOException;
import java.util.Scanner;
public class thread extends Thread{
    boolean stop=false;
   public void run(){
        for(int i=1;i<=100000;i++)
        {
            System.out.println(i);
            if(stop)return;
        }}
    
}
class A{
   
   public static void main(String args[]) throws IOException{
       thread t=new thread();
       Thread th=new Thread(t);
       th.start();
      System.in.read();
      t.stop=true;
   }
}

