package liucaihao.creative.builder;

public class AppleTelePhoneBuilder implements TelePhoneBuilder{

    private TelePhone telePhone = new TelePhone();

    @Override
    public void createPhone() {
        telePhone.setPhone(new ApplePhone());
    }

    @Override
    public void createBattery() {
        telePhone.setBattery(new ABattery());
    }

    @Override
    public TelePhone build() {
        return telePhone;
    }
}
