import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
public class DeleteRowUsingResultSetUpdatable {
    public static void main(String args[])
    {
        try{
            Connection con=UtilityClass.connect();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student");
            rs.absolute(6);
            rs.deleteRow();
            while(rs.next()==true)
            {
                System.out.print(rs.getInt("rollno")+" "+rs.getString("firstname")+" "+rs.getString("branch")+" "+rs.getString("class"));
            }
            con.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
