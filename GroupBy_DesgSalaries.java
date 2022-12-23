import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class GroupBy_DesgSalaries {
    public static void main(String args[])
   {
       try{
           Connection con=UtilityClass.connect();
           String sql="select desg,sum(sal) from employee group by desg";
           PreparedStatement pt=con.prepareStatement(sql);
           ResultSet rs=pt.executeQuery();
           
           while(rs.next()==true)
           {
               String desg=rs.getString(1);
               int sal=rs.getInt(2);
               
               System.out.println(desg+" "+sal);
               
               
           }
           
           con.close();
           
           
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
   }
    
}
