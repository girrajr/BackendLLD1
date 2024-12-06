package oops4;

public abstract class User {

    private static int totalUsers;

    private String userId;
    private String name;
    private String contactInfo;

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

    public User(){
        this.userId = generateUniqueUserId();
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueUserId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user){
        this.userId = generateUniqueUserId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    /**
     * This method is used to display the dashboard
     * of the user based on the type of user
     * which is implemented by the child classes
     */
    abstract void  displayDashboard();


    abstract boolean canBorrowBooks();

    /**
     * This method will generate a unique user id
     * everytime a new user is created
     */
    private String generateUniqueUserId() {
        return "User - "+ ++totalUsers;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
}
