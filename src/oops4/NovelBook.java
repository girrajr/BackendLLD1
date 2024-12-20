package oops4;

public class NovelBook extends Book{

    private String genre;
    private String author;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
        this.author = author;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book Details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }

}
