import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
public class UpdateRowUsing_ResultSetUpdatable {
    public static void main(String args[])
    {
        try{
            Connection con=UtilityClass.connect();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student");
            rs.absolute(3);
            rs.updateString(3, "dsa");
            rs.updateInt(4, 14);
            rs.updateRow();
            con.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
