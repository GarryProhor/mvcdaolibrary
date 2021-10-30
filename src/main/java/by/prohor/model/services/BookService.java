package by.prohor.model.services;

import by.prohor.model.dao.IBookDAO;
import by.prohor.model.dao.MysqlBookDAOImpl;
import by.prohor.model.entity.Book;
import by.prohor.model.exceptions.DAOException;

import java.util.List;

public class BookService {

    private IBookDAO bookDAO;

    public BookService() {
        bookDAO = new MysqlBookDAOImpl();
    }

    public List<Book> getAll() throws DAOException {
        return bookDAO.findAll();
    }

    public Book getById(int id){return null;}
}
