package liucaihao.behavioral.strategy;

/**
 * 相减策略实现类
 */
public class SubstractOperationStrategy implements OperationStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
