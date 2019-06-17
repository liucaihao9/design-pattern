package liucaihao.behavioral.state;

/**
 * 具体状态对象的实现
 */
public class OperatorA implements Operator{

    private static final String STATE = "stateA";

    private Context context;

    public OperatorA(Context context) {
        this.context = context;
    }

    @Override
    public void doAction(String state) {
        if (STATE.equals(state)){
            System.out.println("opeatationA business");
        }else {
            context.setOperator(new OperatorB(context));
            context.callOperatorDoAction(state);
        }
    }
}
