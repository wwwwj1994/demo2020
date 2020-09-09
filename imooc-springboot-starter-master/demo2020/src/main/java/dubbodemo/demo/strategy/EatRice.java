package dubbodemo.demo.strategy;

/**
 * @author wj
 * @date 2020/9/9 - 23:55
 */
public class EatRice implements  Eat{
    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
