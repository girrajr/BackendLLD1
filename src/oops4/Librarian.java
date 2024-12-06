package oops4;

public class Librarian extends User{

    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    void displayDashboard() {
        System.out.println("Librarian Dashboard Employee Number: " + employeeNumber);
    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book){
        System.out.println("Book added successfully");
    }

    void removeBook(Book book){
        System.out.println("Book removed successfully");
    }
}
