package liucaihao.creative.builder;

/**
 * 具体的建造者
 */
public class TelePhoneDirector {

    /**
     * 具体创造手机的过程
     * @param telePhoneBuilder 建造过程具体实现
     * @return
     */
    public TelePhone createTelePhone(TelePhoneBuilder telePhoneBuilder){
        telePhoneBuilder.createPhone();
        telePhoneBuilder.createBattery();
        return telePhoneBuilder.build();
    }

}
