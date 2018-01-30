import java.sql.*;
import java.io.*;
public class img {
    public static void main (String args[]) throws Exception
    {
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        Connection x = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","yash");
            Statement s= x.createStatement();
            PreparedStatement z=x.prepareStatement("insert into image values(?,?)");
            z.setInt(1, 1);
            FileInputStream f=new FileInputStream("C:\\Users\\yash\\Pictures\\SHIVU\\IMG_8685.JPG");
            z.setBinaryStream(2,f,f.available());
            int i=z.executeUpdate();
            System.out.println(i+"image inserted");
            ResultSet a=s.executeQuery("Select * from image");
            while(a.next())
            {
              System.out.println(a.getString(1)+'\t'+a.getBlob(2));
            }
            x.close();
    }
}
