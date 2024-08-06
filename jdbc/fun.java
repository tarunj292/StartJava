import java.sql.*;

class Fun {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "somaiya");

            // create a query
            String q = "insert into table1(tName, tCity) values (?,?)";

            // get the PreparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            // set the values
            pstmt.setString(1, "Durgesh Tiwari");
            pstmt.setString(2, "Lucknow");

            pstmt.executeUpdate();

            System.out.println("Inserted...");

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
