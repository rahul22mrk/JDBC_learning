import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PromoteStudent {
    
    public static void main(String args[])
    {
        try {
            //we wish to send each student in next semester
            Connection con;
            con = UtilityClass.connect();
            Statement st=con.createStatement();
            int n=st.executeUpdate("update student set class=class+1");
            System.out.println(n+" rows updated");
            con.close();
            
        } catch (Exception ex) {
            Logger.getLogger(PromoteStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
