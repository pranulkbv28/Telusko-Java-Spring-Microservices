package JDBC;

import java.sql.*;

public class IntroToJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(null, null, null);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            } // here, after every print, we move to the next row because of rs.next()

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}