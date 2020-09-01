package dubbodemo.demo.singleton.lazy;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author wj
 * @date 2020/9/2 - 0:34
 */
public class ReflectTest {

    @Test
    public void test() {
        try {
            Class clazz = LazyStaticInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o = c.newInstance();
            Object o1 = c.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
