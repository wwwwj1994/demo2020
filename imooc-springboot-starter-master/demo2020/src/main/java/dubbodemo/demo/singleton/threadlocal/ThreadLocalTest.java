package dubbodemo.demo.singleton.threadlocal;

import org.junit.Test;

/**
 * @author wj
 * @date 2020/9/2 - 1:33
 */
public class ThreadLocalTest {

    @Test
    public void test() {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
