package liucaihao.creative.singleton;

/**
 * 使用内部枚举维护单例变量，可以防止反序列化创建新的对象
 */
public class Singleton5 {
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        return InnerEnum.INSTANCE1.instance;
    }





    private static enum InnerEnum{
        INSTANCE1;
        private Singleton5 instance;
        private InnerEnum(){
            instance = new Singleton5();
        }
    }

}
