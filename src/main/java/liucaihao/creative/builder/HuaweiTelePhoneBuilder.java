package liucaihao.creative.builder;

/**
 * 具体建造电话流程
 */
public class HuaweiTelePhoneBuilder implements TelePhoneBuilder{
    private TelePhone telePhone = new TelePhone();
    @Override
    public void createPhone() {
        telePhone.setPhone(new HuaweiPhone());
    }

    @Override
    public void createBattery() {
        telePhone.setBattery(new BBattery());
    }

    @Override
    public TelePhone build() {
        return telePhone;
    }
}
