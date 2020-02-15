package ch2_observer.interfaces;

public interface Subject {


    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
