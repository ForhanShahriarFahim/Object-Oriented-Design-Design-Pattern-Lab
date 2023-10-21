public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void display() {
        super.display();
        checkUserAuthentication();
    }

    private void checkUserAuthentication() {
        System.out.println("User Authentication Check: Authorized User");
    }
}
