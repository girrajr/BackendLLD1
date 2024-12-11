package oops4;

public abstract class Book implements Lendable {

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    public Book(Book book){
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
        this.isAvailable = book.isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if( isAvailable() && user.canBorrowBooks() ){
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        this.isAvailable = true;
    }

    public abstract void displayBookDetails();
}