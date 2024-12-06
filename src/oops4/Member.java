package oops4;

public class Member extends User{

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    @Override
    void displayDashboard() {
      System.out.println("Member Dashboard");
      System.out.println("Name: " + getName());
      System.out.println("Number of Books Borrowed: " + borrowedBooksCount);
    }

    /**
     * This method will check if the user can borrow books
     */
    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

}
