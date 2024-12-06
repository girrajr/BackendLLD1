package oops4;

public abstract class User {

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
        this.userId = "0";
    }

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public User(User user){
        this.userId = user.userId;
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
}
