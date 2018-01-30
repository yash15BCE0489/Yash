import java.io.*;
import java.util.Scanner;

public class thro {
    int a;
    int b;
    int c;
    void get() throws ArithmeticException{
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a/b;
        System.out.println(c);
    }
    public static void main(String args[]) throws ArithmeticException {
        thro A=new thro();
        A.get();
                }}