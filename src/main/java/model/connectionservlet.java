package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionservlet {
   private static Connection con;
   public static Connection getConnection() {
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjsp","root","123456");
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return con;
   }
}
