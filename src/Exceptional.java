import java.io.*;
import java.util.Scanner;
public class Exceptional {
   public static void main(String args[]){
       try {
           Scanner in=new Scanner(System.in);
           int a=in.nextInt();
           int b=in.nextInt();
           int c=a/b;
           System.out.println(c);
       }
       catch(ArithmeticException e){
           System.out.println("b is 0 so it gives infinity");
       }
   }
}
