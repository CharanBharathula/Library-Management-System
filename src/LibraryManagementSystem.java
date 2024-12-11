import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LibraryManagementSystem {
    static List<Book> bookInventory;
    List<User> registeredUsers;
    HashMap<Book, User> map;

    public LibraryManagementSystem(){
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
        map = new HashMap<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public static List<Book> searchBooks(String criteria){
        List<Book> booksFound = new ArrayList<>();
        for( Book book : bookInventory ){
            if( book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria) ){
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    public static List<Book> searchBooks( String criteria, String type ){
        enum SearchType{
            NovelBook, TextBook
        }
        List<Book> booksFound = new ArrayList<>();
        for( Book book : bookInventory ){
            if( book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria) ){
                if( type.equalsIgnoreCase(SearchType.NovelBook.toString()) && book instanceof NovelBook ){
                    booksFound.add(book);
                }
                else if( type.equalsIgnoreCase(SearchType.TextBook.toString()) && book instanceof TextBook ){
                    booksFound.add(book);
                }
            }
        }
        return booksFound;
    }

    public void lendBook( Book book, User user ){
        if( map.containsKey(book) ){
            System.out.printf("Book %s is already lend by %s\n", book.getTitle(), map.get(book).getName());
        }
        else{
            if( book.lend(user) ){
                map.put(book, user);
            }
            else
                System.out.printf("User %s has reached the limit of borrowed books", user.getName());
        }
    }

    public void returnBook( Book book, User user ){
        if( map.containsKey(book) && map.get(book).getName().equalsIgnoreCase(user.getName()) ){
            book.returnBook(user);
        }
        else{
            System.out.printf("Book %s is not lend by %s\n", book.getTitle(), user.getName());
        }
    }

}
