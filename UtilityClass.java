import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilityClass {
    //we are writing a method connect to load the driver and esablish the connection
    public static Connection connect() throws Exception
    {
         Connection con;
             //step-1 driver loading
        Class.forName("com.mysql.jdbc.Driver");
        
        //step-2 connection esablishment
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root@123RK");
        return con; 
    }
    
}
