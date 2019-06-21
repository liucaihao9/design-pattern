package liucaihao.behavioral.observer;

import liucaihao.behavioral.observer.Observer;
import liucaihao.behavioral.observer.ObserverDomain;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private ObserverDomain observerDomain;

    private List<Observer> observers = new ArrayList<>();

    public void setObserverDomain(ObserverDomain observerDomain) {
        this.observerDomain = observerDomain;
        notifyAllObservers();
    }

    public ObserverDomain getObserverDomain() {
        return observerDomain;
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : this.observers){
            observer.operation(this);
        }
    }
}
