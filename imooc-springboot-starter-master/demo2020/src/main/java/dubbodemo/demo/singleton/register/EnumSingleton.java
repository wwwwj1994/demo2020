package dubbodemo.demo.singleton.register;

/**
 * @author wj
 * @date 2020/9/2 - 0:41
 * 枚举类，没有无参数的构造方法，而且不能通过反射进行创建对象，
 * 缺点：属于饿汉式，特殊情况影响内存
 */
public enum  EnumSingleton {

    /**
     * 私有的构造方法
     */
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
