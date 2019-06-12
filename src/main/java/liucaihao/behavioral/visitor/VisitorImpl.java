package liucaihao.behavioral.visitor;

/**
 * 具体访问者实现类
 */
public class VisitorImpl implements Visitor{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone);
        System.out.println("use phone do something");
    }

    @Override
    public void useComputer(Computer computer) {
        System.out.println(computer);
        System.out.println("use computer do something");
    }
}
