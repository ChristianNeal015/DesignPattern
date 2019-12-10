package creationaldesignpattern.singleton;

public class Main {
    public static void main(String[] args) {
        President president = President.getInstance();
        President president1 = president.getInstance();
    }
}
