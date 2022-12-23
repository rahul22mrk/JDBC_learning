import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
public class InsertRowUsingResultSetUpdatable {
    public static void main(String args[])
    {
        try{
            Connection con=UtilityClass.connect();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student");
            System.out.println("Before Inserted...");
            while(rs.next()==true)
            {
                System.out.println(rs.getInt("rollno")+" "+rs.getString("firstname")+" "+rs.getString("branch")+" "+rs.getString("class"));
            }
            rs.moveToInsertRow();
            rs.updateInt(1, 8);
            rs.updateString(2, "XYZtuv");
             rs.updateString(3, "Java");
              rs.updateInt(4, 17);
            rs.insertRow();
            rs.beforeFirst();
            System.out.println("after Inserted...");
            while(rs.next()==true)
            {
                System.out.println(rs.getInt("rollno")+" "+rs.getString("firstname")+" "+rs.getString("branch")+" "+rs.getString("class"));
            }
            con.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
