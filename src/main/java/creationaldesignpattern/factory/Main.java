package creationaldesignpattern.factory;

public class Main {
    public static void main(String[] args) {
        DevManager devManager = new DevManager();
        devManager.takeInterviewer();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterviewer();
    }
}
