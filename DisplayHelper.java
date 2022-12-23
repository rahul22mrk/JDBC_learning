import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Blob;
import java.io.InputStream;
import javax.imageio.ImageIO;
public class DisplayHelper {
    public static ImageIcon getImageIconById(int id,Connection con)
    {
        ImageIcon icon=null;
        try{
            String sql="select pic from images where id=?";
            PreparedStatement pt=con.prepareStatement(sql);
            pt.setInt(1,id);
            
            ResultSet set=pt.executeQuery();
            if(set.next())
            {
                Blob b=set.getBlob("pic");
                InputStream is=b.getBinaryStream();
                Image image=ImageIO.read(is);
                icon=new ImageIcon(image);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return icon;
    }
    
            
    
}
