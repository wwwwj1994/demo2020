package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 22:58
 */
public class YMusic implements Music{
    @Override
    public void openMusic() {
        System.out.println("听国外音乐~~~");
    }
}
