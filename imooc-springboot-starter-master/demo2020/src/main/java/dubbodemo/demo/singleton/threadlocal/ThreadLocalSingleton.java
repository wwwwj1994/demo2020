package dubbodemo.demo.singleton.threadlocal;

/**
 * @author wj
 * @date 2020/9/2 - 1:29
 */
public class ThreadLocalSingleton {

    /**
     *  表示同一个线程内的对象是单例的
     *  由于ThreadLocal 底层存储为 ThreadLocalMap<Thread,Object> 其中key为线程，所以启到了线程隔离
     * */
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingleton.get();
    }
}
