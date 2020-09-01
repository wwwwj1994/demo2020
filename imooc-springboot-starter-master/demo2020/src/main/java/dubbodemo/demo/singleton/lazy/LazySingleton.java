package dubbodemo.demo.singleton.lazy;

/**
 * @author wj
 * @date 2020/9/2 - 0:01
 * 优点：节省空间
 * 缺点：线程不安全
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
