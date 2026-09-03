public class SimplePizzaFactory {
    public Pizza CreatePizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" -> {
                return new CheesePizza();
            }
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
            default -> {
                throw new RuntimeException(type + " is not a type of pizza");
            }
        }
        return pizza;
    }
}
