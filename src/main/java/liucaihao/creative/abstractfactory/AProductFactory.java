package liucaihao.creative.abstractfactory;

public class AProductFactory extends ProductFactory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Battery getBattery() {
        return new BBattery();
    }
}
