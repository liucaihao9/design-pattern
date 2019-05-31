package liucaihao.behavior.singleton;

/**
 * 静态内部类持有单例，调用getInstance返回内部类的持有对象
 * 好处：可以延迟加载，在真正调用getinstance时才会加载内部类，此时才会去实例化单例
 * 由于内部类只会加载一次，因此可以保证线程安全
 */
public class Singleton4 {
    private Singleton4(){
        if (InnerClass.instance != null){
            throw  new IllegalStateException();
        }
    }

    public static Singleton4 getInstance(){
        return InnerClass.instance;
    }


    private static class InnerClass{
        public static Singleton4 instance = new Singleton4();
    }
}
