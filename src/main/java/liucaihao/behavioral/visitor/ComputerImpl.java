package liucaihao.behavioral.visitor;

/**
 * 电脑实现类
 */
public class ComputerImpl implements Computer{
    @Override
    public void listenMusic() {
        System.out.println("listen to music");
    }

    /**
     * 实现接收者接口，在接收者接口的实现中，针对电脑使用具体的操作
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.useComputer(this);
    }
}
