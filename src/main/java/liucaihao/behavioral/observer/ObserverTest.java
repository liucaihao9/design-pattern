package liucaihao.behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ObserverAdd(subject);
        observer.attach();
        observer = new ObserverSubtract(subject);
        observer.attach();
        observer = new ObserverMulti(subject);
        observer.attach();
        ObserverDomain observerDomain = new ObserverDomain(1 , 2);
        subject.setObserverDomain(observerDomain);
    }
}
