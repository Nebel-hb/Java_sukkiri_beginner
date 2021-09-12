import java.sql.*;

public class Main {
  // public static void main(String[] args) throws Exception {

// public class DBConnect1 {
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
  // }
// }
    // Hero h = new Hero();
    // h.name = "ミナト";
    // h.hp = 100;

    // Matango m1 = new Matango();
    // m1.hp = 50;
    // m1.suffix = 'A';

    // Matango m2 = new Matango();
    // m2.hp = 48;
    // m2.suffix = 'B';

    // System.out.println("勇者" + h.name + "を生み出した！");

    // h.sit(5);
    // h.slip();
    // h.sit(25);
    // m1.run();
    // m2.run();
    // h.run();
  }
}
