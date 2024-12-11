
public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("John Doe", "98765312468");
        Member member2 = new Member("James Colonel", "98765312469");

        TextBook textBook1 = new TextBook("1234567890", "TextBook1", "Author1", "Subject1", 1);
        NovelBook novelBook = new NovelBook("1234567891", "NovelBook1", "Author2", "Genre1");
        TextBook textBook2 = new TextBook("1234567892", "TextBook2", "Author1", "Subject2", 2);
        NovelBook novelBook2 = new NovelBook("1234567893", "NovelBook2", "Author2", "Genre2");
        TextBook textBook3 = new TextBook("1234567894", "TextBook3", "Author1", "Subject3", 3);
        NovelBook novelBook3 = new NovelBook("1234567895", "NovelBook3", "Author2", "Genre3");

        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.registerUser(member1);
        lms.registerUser(member2);


        lms.addBook(textBook1);
        lms.addBook(textBook2);
        lms.addBook(textBook3);
        lms.addBook(novelBook);
        lms.addBook(novelBook2);
        lms.addBook(novelBook3);


        /*System.out.println("Books with title TextBook1 or Author1");
        for( Book book : LibraryManagementSystem.searchBooks("Author1", "TextBook") ){
            book.displayBookDetails();
        }*/

        lms.lendBook( textBook1, member1 );
        lms.lendBook( textBook2, member1 );
        lms.lendBook( textBook3, member1 );
        lms.lendBook( novelBook, member1 );
        lms.lendBook( novelBook2, member1 );
        lms.lendBook( novelBook, member2 );

        lms.returnBook( textBook1, member1 );
        lms.returnBook( textBook2, member2 );

    }
}
