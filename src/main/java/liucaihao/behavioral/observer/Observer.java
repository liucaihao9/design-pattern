package liucaihao.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    public Observer(Subject subject){
        this.subject = subject;
    }
    public abstract void operation(Subject subject);
    public abstract void attach();
}
