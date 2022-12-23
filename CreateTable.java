
import java.sql.Connection;
import java.sql.Statement;

public class CreateTable  {
    public static void main(String []args)throws Exception
    {       Connection con=UtilityClass.connect();
            //create a table
            String sql="create table table1(tId int(20)primary key auto_increment,tName varchar(150) not null,tCity varchar(200))";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Table Created...");
           
            con.close();
           
    }
}
