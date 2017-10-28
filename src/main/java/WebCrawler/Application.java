package WebCrawler;

public class Application {

    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();

        String rootUrl = "http://www.bbc.com";

        crawler.discoverWeb(rootUrl);
    }
}
