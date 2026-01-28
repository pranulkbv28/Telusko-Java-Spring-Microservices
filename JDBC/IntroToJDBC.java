package JDBC;

import java.sql.*;

public class IntroToJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("url", "user", "password");

            Statement st = con.createStatement();

            String getStudents = "select * from student";

            ResultSet rs = st.executeQuery(getStudents);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            } // here, after every print, we move to the next row because of rs.next()

            int userId = 4;
            String userName = "Mohini";
            String insertStudent = "insert into student values (" + userId + ",'" + userName + "')";

            int count = st.executeUpdate(insertStudent);

            System.out.println(count + "row/s affected");

            String insertQuery = "insert into student values (?,?)";

            PreparedStatement prepSt = con.prepareStatement(insertQuery);

            prepSt.setInt(1, 5);
            prepSt.setString(2, "Rohan");
            prepSt.setInt(1, 6);
            prepSt.setString(2, "Rohit");
            prepSt.setInt(1, 7);
            prepSt.setString(2, "Ram");

            int count2 = prepSt.executeUpdate();

            System.out.println(count2 + "row/s affected");

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}