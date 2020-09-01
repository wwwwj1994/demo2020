package dubbodemo.demo.singleton.lazy;

/**
 * @author wj
 * @date 2020/9/2 - 0:27
 * 优点：写法优雅：通过静态内部类，性能高，避免了内存浪费
 * 缺点：可以通过反射破坏
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许访问！！");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
