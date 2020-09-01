package dubbodemo.demo.designpaterns.factory.factorypattern;

/**
 * @author wj
 * @date 2020/9/1 - 21:58
 * 工厂模式
 */
public interface AinmalFactory {

    /**
     * 一个抽象工厂，公共的类分别继承抽象工厂（CatFactory extends AinmalFactory）
     * 由具体的工厂来创建具体的对象的实体
     * 缺点：会有大量的具体工厂类，增加了代码类的量
     * @return 工厂方法
     *         返回一个对象
     */
    Ainmal create();
}
