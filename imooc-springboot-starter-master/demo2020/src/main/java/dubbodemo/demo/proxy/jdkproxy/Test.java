package dubbodemo.demo.proxy.jdkproxy;

/**
 * @author wj
 * @date 2020/9/6 - 23:52
 */
public class Test {

    @org.junit.Test
    public void test() {
        IPerson instance = new JDKProxy().getInstance(new ZhangSan());
        instance.findLove();
    }
}
