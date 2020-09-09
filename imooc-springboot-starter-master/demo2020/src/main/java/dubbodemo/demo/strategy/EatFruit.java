package dubbodemo.demo.strategy;

/**
 * @author wj
 * @date 2020/9/9 - 23:56
 */
public class EatFruit implements Eat{
    @Override
    public void eat() {
        System.out.println("吃水果");
    }
}
