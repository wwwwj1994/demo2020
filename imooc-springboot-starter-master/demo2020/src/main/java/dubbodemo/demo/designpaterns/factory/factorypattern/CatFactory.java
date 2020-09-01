package dubbodemo.demo.designpaterns.factory.factorypattern;

/**
 * @author wj
 * @date 2020/9/1 - 22:03
 */
public class CatFactory implements AinmalFactory{
    @Override
    public Ainmal create() {
        return new Cat();
    }
}
