package liucaihao.behavioral.visitor;

/**
 * 抽象访问者接口，针对不同的对象需要有不同的方法来使用不同的对象
 */
public interface Visitor {
    public void usePhone(Phone phone);

    public void useComputer(Computer computer);
}
