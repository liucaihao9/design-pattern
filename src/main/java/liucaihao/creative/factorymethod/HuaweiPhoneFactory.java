package liucaihao.creative.factorymethod;

public class HuaweiPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }
}
