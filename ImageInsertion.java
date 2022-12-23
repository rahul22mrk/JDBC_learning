import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.*;

public class ImageInsertion {
    public static void main(String []args)throws Exception
    {       Connection con=UtilityClass.connect();
            //create a table
            //String sql="create table images(id int primary key auto_increment,pic blob)";
             //  String sql="insert into student values (?,?,?,?)";
            String sql="insert into images  values (?,?)";
           
            PreparedStatement pt=con.prepareStatement(sql);
             pt.setInt(1,1);
            FileInputStream fis=new FileInputStream("C:/Users/HP/Desktop/Advance Java/JDBC/mypic.jpeg");
            pt.setBinaryStream(2, fis, fis.available());
           int n= pt.executeUpdate();
            System.out.println("Image Inserted...");
           
            con.close();
           
    }
    
}
