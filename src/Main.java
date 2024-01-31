import java.sql.*;

import static java.sql.DriverManager.getConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="postgres";
        String sql = "insert into student values (6, 'Joe', 55)";
       // Class.forName("org.postgresql.Driver");
        Connection con= getConnection(url,username,password);
        System.out.println("Connection Established");
//        st.executeQuery(sql);
        Statement st=con.createStatement();
       boolean status = st.execute(sql);
        System.out.println(status);
       //    ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name is " + name);
// System.out.println(rs.next());
//        while(rs.next())
//        {
//            System.out.print(rs.getInt(1)+ " -");
//            System.out.print(rs.getString(2)+ " -");
//            System.out.println(rs.getInt(3));
//
//        }
        System.out.println("Connection closed");
        con.close();


    }
}