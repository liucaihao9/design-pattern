package liucaihao.behavior.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new ApplePhoneFactory();
        Phone phone = phoneFactory.getPhone();
        System.out.println(phone.getName());
        phoneFactory = new HuaweiPhoneFactory();
        phone = phoneFactory.getPhone();
        System.out.println(phone.getName());
    }
}
