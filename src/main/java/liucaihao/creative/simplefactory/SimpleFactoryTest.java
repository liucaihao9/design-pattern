package liucaihao.creative.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Phone phone = PhoneFactory.getPhone("huawei");
        System.out.println(phone.getName());
        phone = PhoneFactory.getPhone("apple");
        System.out.println(phone.getName());
        phone = PhoneFactory.getPhone("test");
        System.out.println(phone);
    }
}
