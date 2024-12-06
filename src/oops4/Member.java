package oops4;

public class Member extends User{

    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    @Override
    void displayDashboard() {
      System.out.println("Member Dashboard Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

}
