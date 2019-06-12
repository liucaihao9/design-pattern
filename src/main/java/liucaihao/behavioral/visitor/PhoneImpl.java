package liucaihao.behavioral.visitor;

/**
 * 手机实现类
 */
public class PhoneImpl implements Phone{
    @Override
    public void call() {
        System.out.println("call someone");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.usePhone(this);
    }
}
