package creationaldesignpattern.builder;

public class Burger {
    protected int size;
    protected boolean cheese = false;
    protected boolean pepperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    public Burger(BurgerBuilder Chris) {
        this.size = Chris.size;
        this.cheese = Chris.cheese;
        this.pepperoni = Chris.pepperoni;
        this.lettuce = Chris.lettuce;
        this.tomato = Chris.tomato;
    }
}
