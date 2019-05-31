package liucaihao.behavior.factorymethod;

public class HuaweiPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }
}
