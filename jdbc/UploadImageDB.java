import java.sql.*;
import java.io.*;
class UploadImageDb
{
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","somaiya");
			String q = "insert into images(pic) values(?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			//pstmt.setString(1,"value");
			FileInputStream fis = new FileInputStream("uploadPicToDb.jpg");
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			System.out.println("Done....");
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}