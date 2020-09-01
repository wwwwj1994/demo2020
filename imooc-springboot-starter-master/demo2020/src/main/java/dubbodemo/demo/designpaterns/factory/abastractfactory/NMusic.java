package dubbodemo.demo.designpaterns.factory.abastractfactory;


/**
 * @author wj
 * @date 2020/9/1 - 22:57
 */
public class NMusic implements Music {
    @Override
    public void openMusic() {
        System.out.println("听国内音乐！！！！");
    }
}
