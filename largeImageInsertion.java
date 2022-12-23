import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class largeImageInsertion {
     public static void main(String []args)throws Exception
    {       Connection con=UtilityClass.connect();
            
            String sql="insert into images (pic) values (?)";
           
            PreparedStatement pt=con.prepareStatement(sql);
            JFileChooser jf=new JFileChooser();
            jf.showOpenDialog(null);
            File file=jf.getSelectedFile();
            FileInputStream fis=new FileInputStream(file);
            pt.setBinaryStream(1, fis, fis.available());
            pt.executeUpdate();
            //System.out.println("Large Image Inserted...");
            JOptionPane.showMessageDialog(null, "Image Inserted Successfully!");
            con.close();
           
    }
    
}
