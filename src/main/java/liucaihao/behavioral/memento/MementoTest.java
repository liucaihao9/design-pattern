package liucaihao.behavioral.memento;

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state1");
        System.out.println(originator.getState());
        Memento memento = originator.saveStateToMemento();
        originator.setState("state2");
        System.out.println(originator.getState());
        originator.getStateFromMemento(memento);
        System.out.println(originator.getState());
    }
}
