public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers;

    public User() {

    }

    public final String generateUniqueId(){
        return "U" + (totalUsers + 1);
    }
    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    //copy constructor
    public User(User original){
        this.userId = original.userId;
        this.name = original.name;
        this.contactInfo = original.contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
}
