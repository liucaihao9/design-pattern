package liucaihao.behavioral.state;

/**
 * 具体状态对象的实现
 */
public class OperatorB implements Operator{
    private static final String STATE = "stateB";

    private Context context;

    public OperatorB(Context context) {
        this.context = context;
    }

    @Override
    public void doAction(String state) {
        if (STATE.equals(state)){
            System.out.println("opeatationB business");
        }
        return;
    }
}
