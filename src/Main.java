import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql/localhost:3306/m_java","root","1234");
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("select * from employee");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}