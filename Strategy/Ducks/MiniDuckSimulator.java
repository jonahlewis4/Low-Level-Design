public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck2 mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck2 model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}