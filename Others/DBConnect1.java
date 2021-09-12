import java.sql.*;

public class DBConnect1 {
  public static void main(String[] args) throws Exception{
    Connection con;
    Statement st;
    ResultSet rs;

    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "test";

    Class.forName("org.postgresql.Driver");

    con = DriverManager.getConnection(url, user, password);
    st = con.createStatement();

    rs = st.executeQuery("SELECT shohin_id, shohin_mei from Shohin");

    rs.next();
    System.out.print(rs.getInt("shohin_id") + ", ");
    System.out.println(rs.getInt("shohin_mei"));

    rs.close();
    st.close();
    con.close();
  }
}