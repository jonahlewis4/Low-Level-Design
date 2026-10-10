package Ducks;

import java.util.ArrayList;

public class Flock extends Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    protected void performQuack() {
        for(Quackable quacker : quackers) {
            quacker.quack();
        }
    }
}
