package liucaihao.behavioral.state;

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        Operator operator = new OperatorA(context);
        context.setOperator(operator);
        context.callOperatorDoAction("stateC");
    }
}
