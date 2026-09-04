public class CaliforniaPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "veggie" -> new CaliforniaStyleVeggiePizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            default -> null;
        };
    }
}
