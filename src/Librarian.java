public class Librarian extends User{
    private String employeeNumber;

    public Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number : " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book){

    }
    void removeBook(Book book){

    }
}
