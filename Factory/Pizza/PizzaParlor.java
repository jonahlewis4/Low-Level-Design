public class PizzaParlor {
    static Pizza orderPizza(String type) {
        Pizza pizza = new SimplePizzaFactory().CreatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public static void main(String[] args) {
        orderPizza("cheese");
    }
}
