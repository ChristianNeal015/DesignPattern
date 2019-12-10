package creationaldesignpattern.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger = (new BurgerBuilder(14)).addPepperoni().addLettuce().addTomato().build();
    }
}
