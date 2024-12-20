package CollectionLab;

public class RecentlyViewedClient {
    public static void main(String[] args) {
        RecentlyViewed<Item> recentlyViewed = new RecentlyViewed();

        recentlyViewed.addRecentlyViewed(new Book("1", "Book1", 100, 10, "Author1"));
        recentlyViewed.addRecentlyViewed(new Book("2", "Book2", 200, 20, "Author2"));
        recentlyViewed.addRecentlyViewed(new Electronics("3", "Electronics1", 300, 30, 1));
        recentlyViewed.addRecentlyViewed(new Electronics("2", "Electronics2", 400, 40, 2));

    }
}
