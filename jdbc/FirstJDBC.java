import java.sql.*;
class FirstJDBC
{
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		//Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Another way
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		//Create a Connection
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username = "root";
		String password = "somaiya";
		Connection con = DriverManager.getConnection(url, root, password);
		
		if(con.isClosed())
			System.out.println("Connection is Closed");
		else
			System.out.println("Connection Created...");
		con.close();
	}
}