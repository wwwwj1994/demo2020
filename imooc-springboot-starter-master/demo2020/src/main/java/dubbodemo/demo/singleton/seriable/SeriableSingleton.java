package dubbodemo.demo.singleton.seriable;

import java.io.Serializable;

/**
 * @author wj
 * @date 2020/9/2 - 1:07
 */
public class SeriableSingleton implements Serializable {

    private static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton (){

    }

    public static SeriableSingleton getInstance() {
        return seriableSingleton;
    }

    /**
     * 在io流读取数据时会根据readResolvef方法来判断当前方法返回值
     * 通过序列化破坏对象的单例模式
     * */
    private Object readResolve () {
        return seriableSingleton;
    }

}
