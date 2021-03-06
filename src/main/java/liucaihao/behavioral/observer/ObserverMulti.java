package liucaihao.behavioral.observer;

public class ObserverMulti extends Observer{
    public ObserverMulti(Subject subject) {
        super(subject);
    }

    @Override
    public void operation(Subject subject) {
        ObserverDomain observerDomain = subject.getObserverDomain();
        System.out.println(observerDomain.getVar1() * observerDomain.getVar2());
    }

    @Override
    public void attach() {
        this.subject.attach(this);
    }
}
