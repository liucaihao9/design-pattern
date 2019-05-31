package liucaihao.behavior.singleton;

/**
 * 单例模式-饿汉模式
 * 饿汉模式在类加载时就创建好对象，线程安全
 */
public class Singleton {
    private Integer i;
    private Singleton(Integer i){
        //在构造器中加入非空判断，可以防止通过反射机制创建实例
        if (instance != null){
            throw new IllegalStateException();
        }
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    private static Singleton instance = new Singleton(1);
    public static Singleton getInstance(){
        return instance;
    }
}
