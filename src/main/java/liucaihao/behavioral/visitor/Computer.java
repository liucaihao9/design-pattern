package liucaihao.behavioral.visitor;

/**
 * 抽象电脑接口，并且继承了接收者接口
 */
public interface Computer extends Acceptor{
    public void listenMusic();
}
