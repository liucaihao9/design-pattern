package liucaihao.behavioral.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        Phone phone = new PhoneImpl();
        phone.accept(visitor);
        Computer computer = new ComputerImpl();
        computer.accept(visitor);
    }
}
