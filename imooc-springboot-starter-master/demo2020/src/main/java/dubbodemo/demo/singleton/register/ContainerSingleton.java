package dubbodemo.demo.singleton.register;

import java.util.HashMap;

/**
 * @author wj
 * @date 2020/9/2 - 0:56
 * 容器式单例模式
 * 缺点：线程不安全
 */
public class ContainerSingleton {

    private ContainerSingleton () {

    }

    private static HashMap<String, ContainerSingleton> instance = new HashMap<> ();

    /**
     * 双重检查锁解决单例不安全问题 spring 源码
     * */
    public static ContainerSingleton getInstance(String className) {
        if (!instance.containsKey(className)) {
            try {
                ContainerSingleton o = (ContainerSingleton)Class.forName(className).newInstance();
                instance.put(className,o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance.get(className);
    }
}
