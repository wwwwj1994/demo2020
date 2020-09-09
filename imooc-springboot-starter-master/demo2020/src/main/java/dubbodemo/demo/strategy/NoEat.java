package dubbodemo.demo.strategy;

/**
 * @author wj
 * @date 2020/9/9 - 23:57
 */
public class NoEat implements Eat{
    @Override
    public void eat() {
        System.out.println("不吃");
    }
}
