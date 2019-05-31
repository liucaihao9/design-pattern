package liucaihao.behavior.factorymethod;

/**
 * 苹果手机工厂，具体工厂实现，返回苹果手机
 */
public class ApplePhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
