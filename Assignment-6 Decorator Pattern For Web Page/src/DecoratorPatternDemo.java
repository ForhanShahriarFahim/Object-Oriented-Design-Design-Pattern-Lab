import java.util.List;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a basic web page.
        WebPage basicWebPage = new BasicWebPage("Welcome to the Decorator Pattern Demo");

        // Add user authentication to the web page.
        WebPage authenticatedWebPage = new AuthenticatedWebPage(basicWebPage);

        // Add pagination to the authenticated web page.
        List<String> searchResults = List.of("Result 1", "Result 2", "Result 3", "Result 4", "Result 5");
        WebPage paginatedWebPage = new PaginatedWebPage(authenticatedWebPage, 2, searchResults);

        // Display the decorated web page.
        paginatedWebPage.display();
    }
}
