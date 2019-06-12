package liucaihao.behavioral.visitor;

/**
 * 抽象接收者接口
 */
public interface Acceptor {
    public void accept(Visitor visitor);
}
