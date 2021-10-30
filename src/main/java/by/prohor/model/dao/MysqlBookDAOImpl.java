package by.prohor.model.dao;

import by.prohor.model.db.ConnectionManager;
import by.prohor.model.entity.Book;
import by.prohor.model.exceptions.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlBookDAOImpl implements IBookDAO{
    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public List<Book> findAll() throws DAOException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        List<Book> books = new ArrayList<>();

        try {
            connection = ConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from books");

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                Date date = resultSet.getDate("date");

                books.add(new Book(id, title, author, date));
            }
        } catch (SQLException throwables) {
            throw new DAOException(throwables);
        } finally {
            ConnectionManager.closeResultSet(resultSet);
            ConnectionManager.closeStatment(statement);
            ConnectionManager.closeConnection();
        }
        return books;
    }
}
