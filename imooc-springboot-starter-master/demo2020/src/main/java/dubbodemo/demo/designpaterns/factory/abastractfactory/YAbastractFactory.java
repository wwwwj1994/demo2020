package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 22:42
 */
public class YAbastractFactory extends AbastractFactory{
    @Override
    protected YMusic buyMusic() {
        return new YMusic();
    }

    @Override
    protected YPlay buyPlay() {

        return new YPlay();
    }
}
