package liucaihao.behavioral.strategy;

/**
 * 策略持有对象
 */
public class Context {
    private final OperationStrategy operationStrategy;

    public Context(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int executeOperationStrategy(int num1 , int num2){
        if (operationStrategy == null){
            throw new NullPointerException("策略对象为空");
        }
        return operationStrategy.doOperation(num1, num2);
    }
}
