package dubbodemo.demo.flyweight;

/**
 * @author wj
 * @date 2020/9/8 - 20:36
 */
public class FlyweightTest {

    public static void main(String[] args) {
        CarFlyweight instance = CarFlyweightFactory.getInstance("北京","上海");
        instance.doFlyweight("硬卧");
    }
}
