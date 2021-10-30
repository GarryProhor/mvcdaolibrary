package by.prohor.model.db;

import java.sql.*;
import java.util.Objects;

public class ConnectionManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library?serverTimezone=Europe/Minsk";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();//логирование
        }
    }

    public static Connection getConnection() throws SQLException {
        if(Objects.isNull(connection)||connection.isClosed()){
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }
        return connection;
    }
    public static void closeConnection(){
        if(Objects.nonNull(connection)){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeStatment(Statement statement){
        if(Objects.nonNull(statement)){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeResultSet(ResultSet resultSet){
        if(Objects.nonNull(resultSet)){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
