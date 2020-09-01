package dubbodemo.demo.designpaterns.factory.factorypattern;

import dubbodemo.demo.designpaterns.factory.simplefactorypattern.SimpleFactory;
import org.junit.Test;

/**
 * @author wj
 * @date 2020/9/1 - 21:42
 */
public class AinmalTest {

    @Test
    public void test() {
        Ainmal ainmal = new CatFactory().create();
        ainmal.eat();
    }
}
