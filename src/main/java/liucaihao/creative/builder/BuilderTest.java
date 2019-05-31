package liucaihao.creative.builder;

public class BuilderTest {
    public static void main(String[] args) {
        TelePhoneDirector telePhoneDirector = new TelePhoneDirector();
        /**
         * 由苹果手机实现来创建苹果手机
         */
        TelePhone telePhone = telePhoneDirector.createTelePhone(new AppleTelePhoneBuilder());
        System.out.println(telePhone.getPhone().getName());
        System.out.println(telePhone.getBattery().getCapacity());
        /**
         * 由华为手机实现来创建华为手机
         */
        telePhone = telePhoneDirector.createTelePhone(new HuaweiTelePhoneBuilder());
        System.out.println(telePhone.getPhone().getName());
        System.out.println(telePhone.getBattery().getCapacity());
    }
}
