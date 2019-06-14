package liucaihao.behavioral.strategy;

/**
 * 相乘策略实现类
 */
public class MultiplyOperationStrategy implements OperationStrategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
