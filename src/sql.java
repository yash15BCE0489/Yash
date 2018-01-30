import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.lang.*;
public class sql {
    public static void main (String args[]) throws Exception
    {
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        Connection x = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","yash");
            Statement s= x.createStatement();
            //for(int i=0;i<10;i++)
            //{int a=s.executeUpdate("DELETE FROM employee WHERE id = 1");}
            //System.out.println("hence inserted");
            //int v=s.executeUpdate("ALTER TABLE employee drop column salary");
            ResultSet a=s.executeQuery("Select * from employee");
            while(a.next())
            {
                System.out.println(a.getString(1)+'\t'+a.getString(2)+'\t'+a.getString(3)+'\t');
            }
            x.close();
    }
}