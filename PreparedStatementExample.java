import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparedStatementExample {
    public static void main(String args[])
    {
        try{
            Connection con=UtilityClass.connect();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter RollNo of student to promote ");
            String n=sc.next();
            String sql="update student set class=class+1 where rollno=?";
            //to execute parametrized sql we need PreparedStatement object (instead of Statement)
            PreparedStatement pt=(PreparedStatement) con.prepareStatement(sql);
            pt.setString(1, n);
            int n1=pt.executeUpdate();
            System.out.println(n1+" rows Updated!");
            con.close();
        }catch (Exception ex) {
            Logger.getLogger(PreparedStatementExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
