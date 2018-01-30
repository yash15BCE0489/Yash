import java.io.*;
import java.util.Scanner;
import javax.swing.*;
public class form extends JFrame{
    JFrame f;
    form(){
        JButton b = new JButton("SAVE");
        JLabel a=new JLabel("Name");
        JLabel d=new JLabel("phone");
        JTextField c= new JTextField();
        JTextField e= new JTextField();
        a.setBounds(65, 10, 200, 80);
        b.setBounds(130, 200, 100, 40);
        c.setBounds(195,20,60,40);
        add(a);add(c);
        add(b);setSize(600,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new form();
    }
}
