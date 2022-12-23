import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeProjectList {
     public static void main(String args[])
   {
       try{
           Connection con=UtilityClass.connect();
           String sql="select ename,ptitle from employee,project where employee.pcode=project.pcode";
           PreparedStatement pt=con.prepareStatement(sql);
           ResultSet rs=pt.executeQuery();
           while(rs.next()==true)
           {
               String ename=rs.getString(1);
               String ptitle=rs.getString(2);
               
               System.out.println(ename+" "+ptitle);
               
           }
           con.close();
           
           
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
   }
}
