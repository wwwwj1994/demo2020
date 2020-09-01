package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 22:08
 * 抽象工厂
 */
public abstract class AbastractFactory {

    /**
     * 抽象工厂：提供了抽象的实现，同一个生产产家的生产产品
     * 问题：需要写类太多，如果修改频率低，可以使用
     * */
    protected void init () {
        System.out.println("开始消费~~~");
    }

    protected abstract Music buyMusic();

    protected abstract Play buyPlay();

}
