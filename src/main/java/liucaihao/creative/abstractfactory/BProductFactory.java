package liucaihao.creative.abstractfactory;

public class BProductFactory extends ProductFactory{
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }

    @Override
    public Battery getBattery() {
        return new ABattery();
    }
}
