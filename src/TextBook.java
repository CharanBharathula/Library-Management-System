public class TextBook extends Book{
    private String subject;
    private int edition;

    public TextBook( String isbn, String title, String author, String subject, int edition ){
        super( isbn, title, author );
        this.subject = subject;
        this.edition = edition;
    }

    public void displayBookDetails(){
        super.displayBookDetails();
        System.out.println("Book subject : " + subject);
        System.out.println("Book edition : " + edition);
    }

}
