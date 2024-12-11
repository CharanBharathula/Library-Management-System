public class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public Book( Book original ){
        this.isbn = original.isbn;
        this.title = original.title;
        this.author = original.author;
        this.isAvailable = original.isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if( isAvailable() ){
            if( user.canBorrowBooks() ){
                isAvailable = false;
                int bC = ((Member) user).getBorrowedBooksCount();
                ((Member) user).setBorrowedBooksCount( bC + 1 );
                return true;
            }
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        int bC = ((Member) user).getBorrowedBooksCount();
        ((Member) user).setBorrowedBooksCount( bC - 1 );
    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void displayBookDetails(){
        System.out.println("Book ISBN : " + isbn);
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Availability : " + isAvailable);
    }
}
