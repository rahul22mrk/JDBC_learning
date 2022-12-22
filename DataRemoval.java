import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class DataRemoval {
    public static void main(String []args)
    {
        
        try{
            //we want to remove some data from databases
        //step-1 driver loading
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver Loaded Successfully!");
          
        //step-2 connection esatblishment
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root@123RK");
        System.out.println("Connection Esablished Successfully!");
        //step-3 create statement
        Statement st=con.createStatement();
        //step-4 eecute query
        int n=(int)st.executeLargeUpdate("delete from student where rollno<100");
        
        System.out.println(n+" Rows Removed!");
        //step-5 close connection
        con.close();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
}
