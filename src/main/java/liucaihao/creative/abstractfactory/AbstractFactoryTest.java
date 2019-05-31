package liucaihao.creative.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ProductFactory productFactory = new AProductFactory();
        Phone phone = productFactory.getPhone();
        Battery battery = productFactory.getBattery();
        System.out.println(phone.getName());
        System.out.println(battery.getCapacity());
        productFactory = new BProductFactory();
        phone = productFactory.getPhone();
        battery = productFactory.getBattery();
        System.out.println(phone.getName());
        System.out.println(battery.getCapacity());
    }
}
