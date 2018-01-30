/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash Agarwal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetDateFromMySql {
  public static Connection getMySQLConnection() throws Exception {
    java.lang.Class.forName("com.mysql.jdbc.Driver");
          return DriverManager.getConnection("jdbc:mysql://localhost:3306/vaxne","root","Yash");
    
  }
  public static Date addDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
				
		return cal.getTime();
	}

  public static void main(String args[]) {
    ResultSet rs = null;
    Connection conn = null;
    Statement stmt = null;
    try {
      conn = getMySQLConnection();
      stmt = conn.createStatement();
      rs = stmt.executeQuery("select * from child;");
      while (rs.next()) {
        //java.sql.Time dbSqlTime = rs.getTime(1);
        java.sql.Date dbSqlDate = rs.getDate(6);
        Date D = addDays(dbSqlDate, 10);
        System.out.println("dbSqlDate=" + dbSqlDate);
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "dbSqlDate after adding 10 days= ", D);
        System.out.println("\ndbSqlDate after adding 10 days= " + D);
        DateFormat df = new SimpleDateFormat("E, dd MMMM yyyy");
        Date t = Calendar.getInstance().getTime();
        String r = df.format(t);
        System.out.println("\nd today   = " + r);
        java.util.Date dbSqlDateConverted = new java.util.Date(dbSqlDate.getTime());
        System.out.println("in standard date");
        System.out.println(dbSqlDateConverted);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        stmt.close();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}

