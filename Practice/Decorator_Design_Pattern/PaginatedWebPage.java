class PaginatedWebPage extends WebPageDecorator {
    public PaginatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void display() {
        super.display();
        splitSearchResults();
    }

    private void splitSearchResults() {
        System.out.println("Splitting search results into multiple pages...");
        System.out.println("Displaying search results across multiple pages.");
    }
}