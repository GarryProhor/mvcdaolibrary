package by.prohor.controllers;

import by.prohor.model.entity.Book;
import by.prohor.model.exceptions.DAOException;
import by.prohor.model.services.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookListController", value = "/getAll")
public class BookListController extends HttpServlet {
    private BookService service;

    public BookListController() {
        service=new BookService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = null;
        try {
            books = service.getAll();
            request.setAttribute("books", books);
        } catch (DAOException e) {
            request.setAttribute("message ", e.getMessage());
            e.printStackTrace();//логирование
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
