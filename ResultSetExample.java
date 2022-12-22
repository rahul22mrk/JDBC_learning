import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSetExample {
   public static void main(String args[])
   {
       try{
           Connection con=UtilityClass.connect();
           String sql="select * from student where branch ='dsa'";
           PreparedStatement pt=con.prepareStatement(sql);
           ResultSet rs=pt.executeQuery();
           while(rs.next()==true)
           {
               String roll=rs.getString(1);
               String fname=rs.getString(2);
               String sub=rs.getString(3);
               String cla=rs.getString(4);
               System.out.println(roll+" "+fname+" "+sub+" "+cla);
               
           }
           con.close();
           
           
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
   }
    
}
