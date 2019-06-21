package liucaihao.behavioral.observer;

public class ObserverAdd extends Observer{

    public ObserverAdd(Subject subject){
        super(subject);
    }

    @Override
    public void operation(Subject subject) {
        ObserverDomain observerDomain = subject.getObserverDomain();
        System.out.println(observerDomain.getVar1() + observerDomain.getVar2());
    }

    @Override
    public void attach() {
        subject.attach(this);
    }
}
