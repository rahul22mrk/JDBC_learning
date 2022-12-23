import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataExample {
       public static void main(String args[])
   {
       try{
           Connection con=UtilityClass.connect();
           String sql="select * from student";
           PreparedStatement pt=con.prepareStatement(sql);
           ResultSet rs=pt.executeQuery();
           ResultSetMetaData rsmd=rs.getMetaData();
           int n=rsmd.getColumnCount();
           System.out.println("***********************************************************************************");
           for(int i=1;i<=n;i++)
           {
               System.out.print(rsmd.getColumnName(i)+"\t");
           }
           System.out.println();
             System.out.println("***********************************************************************************");
           while(rs.next()==true)
           {
               for(int i=1;i<=n;i++)
               {
                   System.out.print(rs.getString(i)+"\t");
               }
               System.out.println();
               
           }
             System.out.println("***********************************************************************************");
           con.close();
           
           
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
   }
}
