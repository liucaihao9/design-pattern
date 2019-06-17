package liucaihao.behavioral.state;

/**
 * 状态对象的持有对象，上下文
 */
public class Context {

    private Operator operator;

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void callOperatorDoAction(String state){
        operator.doAction(state);
    }
}
