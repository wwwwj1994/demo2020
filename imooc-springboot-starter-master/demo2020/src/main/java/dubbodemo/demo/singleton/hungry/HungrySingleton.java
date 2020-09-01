package dubbodemo.demo.singleton.hungry;

/**
 * @author wj
 * @date 2020/9/1 - 23:58
 * 饿汉式单例模式：
 * <p>
 * 优点： 效率高，没有锁
 * 缺点： 浪费内存
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
