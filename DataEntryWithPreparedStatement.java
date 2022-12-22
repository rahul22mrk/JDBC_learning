import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;


public class DataEntryWithPreparedStatement {
    public static void main(String []args)
    {
        try{
            System.out.println("Enter total number of rows which you want to insert into db: ");
            Scanner sc=new Scanner(System.in);
            int rows=sc.nextInt();
            Connection con=UtilityClass.connect();
            String sql="insert into student values (?,?,?,?)";
            
            for(int i=0;i<rows;i++){
                System.out.println("***************** "+(i+1)+"th rows data entry ********************************************");
                System.out.println("Enter the rollno: ");
                String roll=sc.next();
                 System.out.println("Enter the firstname: ");
                String first=sc.next();
                System.out.println("Enter the subject: ");
                String sub=sc.next();
                System.out.println("Enter the class: ");
                String cl=sc.next();
                PreparedStatement pt=con.prepareStatement(sql);
                pt.setString(1, roll);
                pt.setString(2, first);
                pt.setString(3, sub);
                pt.setString(4, cl);
                int n=pt.executeUpdate();
                System.out.println(n+" rows inserted!");
                
                
            }
            con.close();
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
