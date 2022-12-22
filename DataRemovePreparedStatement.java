import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DataRemovePreparedStatement {
    public static void main(String []args)
    {
        try{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rollno : ");
    int roll=sc.nextInt();
    Connection con=UtilityClass.connect();
    String sql="delete from student where rollno=?";
    PreparedStatement pt=con.prepareStatement(sql);
    pt.setInt(1, roll);
    int n=pt.executeUpdate();
    if(n>0)
    {
        System.out.print(" Record removed Successfully!");
    }else{
        System.out.print("Invalid Roll number!");
    }
    con.close();
    
}catch(Exception e)
{
    e.printStackTrace();
}
    }
 
    
}
