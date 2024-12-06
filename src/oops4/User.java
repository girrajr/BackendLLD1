package oops4;

public abstract class User {

    private String  userId;
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

    abstract void  displayDashboard();
    abstract boolean canBorrowBooks();
}
