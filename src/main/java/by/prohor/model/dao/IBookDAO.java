package by.prohor.model.dao;

import by.prohor.model.entity.Book;
import by.prohor.model.exceptions.DAOException;

import java.util.List;

public interface IBookDAO {

    Book findById(int id);
    List<Book> findAll() throws DAOException;
}
