package liucaihao.behavioral.strategy;

/**
 * 相加策略实现类
 */
public class AddOperationStrategy implements OperationStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
