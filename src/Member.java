public class Member extends User{
    private int borrowedBooksCount;

    // constant
    private final static int MAX_BORROW_LIMIT = 5;

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed : " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
