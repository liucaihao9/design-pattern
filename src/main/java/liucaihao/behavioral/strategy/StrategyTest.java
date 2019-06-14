package liucaihao.behavioral.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        OperationStrategy operationStrategy = new AddOperationStrategy();
        Context context = new Context(operationStrategy);
        int result = context.executeOperationStrategy(1,3);
        System.out.println(result);
    }
}
