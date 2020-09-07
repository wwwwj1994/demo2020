package dubbodemo.demo.proxy.cglibproxy;

/**
 * @author wj
 * @date 2020/9/7 - 0:01
 */
public class Test {

    @org.junit.Test
    public void test() {
        ZhangSan zhangSan = (ZhangSan)new CglibProxyTest().getInstance(ZhangSan.class);
        zhangSan.findLove();
    }

    public static void main(String[] args) {
        ZhangSan zhangSan = (ZhangSan)new CglibProxyTest().getInstance(ZhangSan.class);
        zhangSan.findLove();
    }
}
