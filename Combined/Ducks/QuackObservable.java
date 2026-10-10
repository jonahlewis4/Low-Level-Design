package Ducks;

public interface QuackObservable {
    public void registerObserver(QuackObserver observer);
    public void notifyObservers();
}
