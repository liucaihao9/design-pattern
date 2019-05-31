package liucaihao.creative.singleton;

/**
 * 这种方法（双重检查）相比整个方法加锁性能会更好，并发情况下大部分线程都不需要加锁
 * 少部分可能需要加锁串行执行才能获得实例
 */
public class Singleton3 {
    private Singleton3(){
        if (instance != null){
            throw new IllegalStateException();
        }
    }
    private static Singleton3 instance = null;
    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
