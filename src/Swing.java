import java.awt.event.ActionEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.sql.ResultSet;
public class Swing extends JFrame{
    JFrame f;
    JLabel l1,l2;
    JTextField  t1,t2;
    JButton a;
     Swing() 
    {
        l1 = new JLabel("NAME");
        l2= new JLabel("Phone no.");
        t1 =new JTextField();
        t2 =new JTextField();
        a = new JButton("SAVE");
        
        l1.setBounds(65, 0, 200, 80);
        l2.setBounds(65, 30, 200, 80);
        t1.setBounds(195, 30, 200, 20);
        t2.setBounds(195, 60, 200, 20);
        a.setBounds(100 , 100, 100, 50);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(a);
        setSize(600,600);
        setLayout(null);
        setVisible(true);}
        public void actionPerformed(ActionEvent e)
        {
            
                String name=t1.getText();
                String no=t2.getText();
                Connection conn=null;
                PreparedStatement ps=null;
               
                    try
                    {
                        java.lang.Class.forName("com.mysql.jdbc.Driver");
        Connection x = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","yash");
        PreparedStatement z=x.prepareStatement("insert into form values(?,?)");
        z.setString(1, name);
        z.setString(1, no);
        int i=ps.executeUpdate();
        
      
        if(i>0)
        {
            JOptionPane.showMessageDialog(null,"Data Saved carefully");
        }
        else{
            JOptionPane.showMessageDialog(null,"Data not Saved carefully");
        }}
                    catch(Exception ex)
                    {
                        System.out.println(ex);
                    }
                }
                    
          
                

    public static void main(String args[]) throws Exception
    {
        new Swing();
    }
}
