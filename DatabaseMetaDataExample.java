import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class DatabaseMetaDataExample {
    public static void main(String args[]) throws Exception
   {
       
           Connection con=UtilityClass.connect();
           DatabaseMetaData dbmd=con.getMetaData();
           System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
           System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
           System.out.println("Database Driver Name: "+dbmd.getDriverName());
           System.out.println("Database Driver Version: "+dbmd.getDriverVersion());
          
            con.close();
          
   }
    
}
