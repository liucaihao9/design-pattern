package liucaihao.behavioral.memento;

/**
 *
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        Memento memento = new Memento();
        memento.setState(this.state);
        return memento;
    }

    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
