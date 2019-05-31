package liucaihao.creative.singleton;

/**
 * 使用延迟加载，当真正需要单例的时候才去实例化
 * 但是多线程环境下效率特别低，无论实例是否创建了都需要串行执行
 */
public class Singleton2 {
    private Singleton2(){
        if (instance != null){
            throw new IllegalStateException();
        }
    }
    private static Singleton2 instance = null;
    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
