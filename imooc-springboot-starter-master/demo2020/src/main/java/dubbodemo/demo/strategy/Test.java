package dubbodemo.demo.strategy;

import java.util.Set;

/**
 * @author wj
 * @date 2020/9/10 - 0:05
 */
public class Test {

    public static void main(String[] args) {
        Set<String> keys = EatFactory.getKeys();
        String key = "NO_EAT";
        EatFactory.getEatInstance(key).eat();
    }
}
