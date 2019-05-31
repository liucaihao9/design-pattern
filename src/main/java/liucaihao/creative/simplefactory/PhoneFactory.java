package liucaihao.creative.simplefactory;

public class PhoneFactory {
    public static Phone getPhone(String phoneName){
        switch (phoneName){
            case "huawei" : return new HuaweiPhone();
            case "apple" : return  new ApplePhone();
            default: return null;
        }
    }
}
