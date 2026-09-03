public class PizzaTester {
    public static void main(String[] args) {
        new PizzaStore(new SimplePizzaFactory()).orderPizza("cheese");
    }
}
