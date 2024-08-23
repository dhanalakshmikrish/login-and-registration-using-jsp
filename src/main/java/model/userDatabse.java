package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class userDatabse {

	  Connection con;
	     
	     public userDatabse(Connection con) {
	    	 this.con=con;
	    	 
	     }
	      
	     public boolean saveuser(user User)
	     {
	    	 boolean set=false;
	    	 try
	    	 {
	    		 String query="insert into user(name,email,pasword)values(?,?,?)";
	    		 PreparedStatement pt=this.con.prepareStatement(query);
	    		 pt.setString(1,User.getName());
	    		 pt.setString(1,User.getEmail());
	    		 
	    	 pt.executeUpdate();
	    	 set=true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	    	 return set;
	     }
}
