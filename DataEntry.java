
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DataEntry {
    
    public static void main(String args[])
    {
         try{
             //steps-1: Driver loading
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Driver Loaded Successfully!!");
       
       //steps-2 Connection establish
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root@123RK");
       System.out.println("Connection Establish successfully!!");
       //steps-3 create the statement object to DB we can use Statement or PreparedStatement
       Statement stmt=(Statement) con.createStatement();
       
       //steps-4 send sql to database
      // String query="insert into student values(1,'Rahul','Computer Science',3)";
      // int n=stmt.executeUpdate(query);
      stmt.executeUpdate("insert into student values (2,'AAA','Java',4)");
       stmt.executeUpdate("insert into student values (3,'ABA','C++',5)");
        stmt.executeUpdate("insert into student values (4,'AAC','C',6)");
         stmt.executeUpdate("insert into student values (5,'BAA','JavaScript',7)");
          stmt.executeUpdate("insert into student values (6,'BBA','NodeJS',8)");
      
       System.out.println(" rows affected!");
       //step-5 close the connection
       con.close();
    
    }catch(ClassNotFoundException ex)
    {
        ex.printStackTrace();
    }catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
    
   
    
}
