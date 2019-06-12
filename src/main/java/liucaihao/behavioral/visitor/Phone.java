package liucaihao.behavioral.visitor;
/**
 * 抽象手机接口，并且继承了接收者接口
 */
public interface Phone extends Acceptor{
    public void call();
}
