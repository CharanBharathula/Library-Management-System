public class NovelBook extends Book{
    private String genre;

    public NovelBook( String isbn, String title, String author, String genre ){
        super( isbn, title, author );
        this.genre = genre;
    }

    public void displayBookDetails(){
        super.displayBookDetails();
        System.out.println("Book genre : " + genre);
    }
}
