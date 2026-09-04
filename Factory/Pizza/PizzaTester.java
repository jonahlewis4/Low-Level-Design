public class PizzaTester {
    public static void main(String[] args) {
        String pizzaType = "cheese";
        PizzaStore chiStore = new ChicagoPizzaStore();
        chiStore.orderPizza(pizzaType);
    }
}
