import java.sql.*;

public class ResultExample {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "dur@Shadow1414";
   
public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query to create statment with
      // required arguments for RS example.
      System.out.println("Creating statement...");
      stmt = conn.createStatement(
                           ResultSet.TYPE_SCROLL_INSENSITIVE,
                           ResultSet.CONCUR_READ_ONLY);
      String sql;
      sql = "SELECT id, first, last, age FROM Employees";
      ResultSet rs = stmt.executeQuery(sql);

      // Move cursor to the last row.
      System.out.println("Moving cursor to the last...");
      rs.last();
      
      //STEP 5: Extract data from result set
      System.out.println("Displaying record...");
      //Retrieve by column name
      int id  = rs.getInt(1);

      String first = rs.getString(3);
      String last = rs.getString(4);
  
      //Display values
      System.out.print("ID: " + id);
      System.out.print(", Age: " + age);
      System.out.print(", First: " + first);
      System.out.println(", Last: " + last);

      // Move cursor to the first row.
      System.out.println("Moving cursor to the first row...");
      rs.first();
      
      //STEP 6: Extract data from result set
      System.out.println("Displaying record...");
      //Retrieve by column name
      id  = rs.getInt("id");
      age = rs.getInt("age");
      first = rs.getString("first");
      last = rs.getString("last");
  
      //Display values
      System.out.print("ID: " + id);
      System.out.print(", Age: " + age);
      System.out.print(", First: " + first);
      System.out.println(", Last: " + last);
     // Move cursor to the first row.

      System.out.println("Moving cursor to the next row...");
      rs.next();
      
      //STEP 7: Extract data from result set
      System.out.println("Displaying record...");
      id  = rs.getInt("id");
      age = rs.getInt("age");
      first = rs.getString("first");
      last = rs.getString("last");
  
      //Display values
      System.out.print("ID: " + id);
      System.out.print(", Age: " + age);
      System.out.print(", First: " + first);
      System.out.println(", Last: " + last);

      //STEP 8: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
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
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExampl