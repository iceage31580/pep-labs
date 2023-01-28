package Application.Service;

import Application.DAO.BookDAO;
import Application.Model.Book;

import static org.mockito.ArgumentMatchers.nullable;

import java.util.List;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class BookService {
    public BookDAO bookDAO;

    /**
     * No-args constructor for bookService which creates a BookDAO.
     * There is no need to change this constructor.
     */
    public BookService(){
        bookDAO = new BookDAO();
    }
    /**
     * Constructor for a BookService when a BookDAO is provided.
     * This is used for when a mock BookDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of BookService independently of BookDAO.
     * There is no need to modify this constructor.
     * @param bookDAO
     */
    public BookService(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }
    /**
     * TODO: Use the bookDAO to retrieve all books.
     * @return all books.
     */
    public List<Book> getAllBooks() {
        return null;
    }
    /**
     * TODO: Use the bookDAO to persist a book to the database.
     * An ISBN will be provided in Book. Method should check if the book ISBN already exists before it attempts to
     * persist it.
     * @param book a book object.
     * @return book if it was successfully persisted, null if it was not successfully persisted (eg if the book primary
     * key was already in use.)
     */
    public Book addBook(Book book) {
        Connection connection = null; 
        PreparedStatement = null; 

        try{
            conncetion = Drivermanager.getConnection(DB_URL, DB_USER, DB_PASSWORD); 
            statement = connection.prepareStatement("SELECT COUNT(*) FROM  books WHERE  ISN = ?"); 
            statement.setString(1, book.getIsbn()); 
            ResultSet result = statement.executeQuery(); 
            if(result.next() && result.getInt(1) > 0)
            {
                return null; 
            }

            //Insert the book 
            statement = connection.prepareStatement("INSERT INTO books (isb, title, author, publisher) VALUES(?,?,?,?)"); 
            statement.setString(1, book.getIsn()); 
            statement.setString(2, book.getTItle()); 
            statement.setString(3, book.getAuthor()); 
            statement.setString(4, book.getPublisher()); 
            statement.executeUpdate(); 
            return book; 
        }

        catch(SQLException e)
        {
            e.printStackTrace(); 
            return null; 
        }
        
        finally
        {
            if(statement != null)
            {
                statement.close(); 
            }
            if(connection != nullable(null
            {
                connection.close(); 
            } catch (SQLException e)
            {
                e.printStackTrace(); 
            }
        }

        
    }
    /**
     * TODO: Use the bookDAO to retrieve a list of all books that have a bookCount above 0.
     * @return all available books (bookCount over zero)
     */
    public List<Book> getAllAvailableBooks() {
        return null;
    }

}
