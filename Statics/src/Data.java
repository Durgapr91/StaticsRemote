import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {

	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   public static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels";

	   //  Database credentials
	   public static final String USER = "root";
	   public static final String PASS = "dur@Shadow1414";
	   public static void saveDetails(Driv dd)
	   {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO Driv " +
	                   "VALUES ('"+dd.getName()+"','"+dd.getEmailId()+"','"+dd.getAge()+"')";
	      stmt.executeUpdate(sql);
	      
	    
	      
	      System.out.println("Inserted records into the table...");
	      
	      Statement smt=conn.createStatement();
	      String sql1="update Driv" +"set age= '"+dd.getAge()+"' where name='"+dd.getName()+"'"; 
	      smt.executeUpdate(sql1);

	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	   public static void updateDetails(Driv dr)
	   {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("updating records into the table...");
	      stmt = conn.createStatement();
	      String sql1="update Driv set age= '"+dr.getAge()+"' where name='"+dr.getName()+"'"; 
	      stmt.executeUpdate(sql1);
	    
	      System.out.println("updated records into the table...");
	      
	     
	   

	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end mai
	}//end JDBCExample

