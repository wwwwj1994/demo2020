package dubbodemo.demo.designpaterns.factory.factorypattern;

/**
 * @author wj
 * @date 2020/9/1 - 22:02
 */
public class DocFactory implements AinmalFactory{
    @Override
    public Ainmal create() {
        return new Dog();
    }
}
