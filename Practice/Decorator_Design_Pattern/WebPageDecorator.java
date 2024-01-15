abstract class WebPageDecorator implements WebPage {
    protected WebPage decoratedPage;

    public WebPageDecorator(WebPage decoratedPage) {
        this.decoratedPage = decoratedPage;
    }

    @Override
    public void display() {
        decoratedPage.display();
    }
}