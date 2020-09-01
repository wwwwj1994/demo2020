package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 22:42
 */
public class NAbastractFactory extends AbastractFactory{
    @Override
    protected Music buyMusic() {
        return new NMusic();
    }

    @Override
    protected Play buyPlay() {
        return new NPlay();
    }
}
