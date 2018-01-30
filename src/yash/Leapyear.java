package yash;
import java.lang.*;
import java.util.Scanner;
public class Leapyear {
public static void main(String arg[])
{       int l;
        Scanner in=new Scanner(System.in);
        l=in.nextInt();
        if(l%4==0||l%100==0)
        {
            System.out.println("This is leap year");
        }
        else
        {
            System.out.println("This is not leap year");
        }
}
}
