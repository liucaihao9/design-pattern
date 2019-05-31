package liucaihao.creative.builder;

/**
 * 抽象建造电话流程
 */
public interface TelePhoneBuilder {
    public void  createPhone();

    public void createBattery();

    public TelePhone build();
}
