import java.io.*;
import java.util.Scanner;
public class Exception1 {
    public static void main(String args[]){
       try {
           Scanner in=new Scanner(System.in);
           int a[]=new int[5];
           for(int i=0;i<6;i++){
               a[i]=in.nextInt();
           }
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array hass only 5 spaces of data but we input 6 data");
       }
   }
}
