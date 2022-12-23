import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DesgSalaries {
    public static void main(String args[])
   {
       try{
           Connection con=UtilityClass.connect();
           String sql="select * from employee";
           PreparedStatement pt=con.prepareStatement(sql);
           ResultSet rs=pt.executeQuery();
           int seSal=0;
           int stSal=0;
           int pmSal=0;
           int tlSal=0;
           while(rs.next()==true)
           {
               String desg=rs.getString("desg");
               int sal=rs.getInt("sal");
               switch(desg)
               {
                   case "SE" -> seSal+=sal;
                   case "ST" -> stSal+=sal;
                   case "PM" -> pmSal+=sal;
                       
                   case "TL" -> tlSal+=sal;
               }
               
               
               
           }
           System.out.println(seSal+" "+stSal+" "+pmSal+" "+tlSal);
           con.close();
           
           
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
   }
    
}
